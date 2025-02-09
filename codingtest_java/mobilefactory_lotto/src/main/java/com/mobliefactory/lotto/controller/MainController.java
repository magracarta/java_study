package com.mobliefactory.lotto.controller;

import com.mobliefactory.lotto.DTO.Lottonumber;
import com.mobliefactory.lotto.service.LottoRandomSend;
import com.mobliefactory.lotto.service.PhoneService;
import com.mobliefactory.lotto.util.CookieFn;
import com.mobliefactory.lotto.util.TimeFn;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

    private final  CookieFn cookieFn;
    private final  TimeFn tf;

    private final PhoneService ps;
    private final LottoRandomSend ls;

    @Autowired
    public MainController(CookieFn cookieFn, TimeFn tf, PhoneService ps, LottoRandomSend ls) {
        this.cookieFn = cookieFn;
        this.tf = tf;
        this.ps = ps;
        this.ls = ls;
    }

    @GetMapping("/")
    public String index(HttpServletRequest request, HttpServletResponse response){
        boolean firstVisit = cookieFn.checkCookie(request,"firstVisit");
        //이벤트 기간 중 그리고 하루 중 최초 접속 시 링크 변경
        if( tf.eventTime() && firstVisit){
            //12시 50분 59초에서 현재시간을 뺸다.
            cookieFn.setCookie(response,"firstVisit",tf.calcuTime(),"false");
            return  "redirect:/formPage";
        }
        if (tf.announceTime() && firstVisit) {
            cookieFn.setCookie(response,"firstVisit",tf.calcuTime(),"false");
            return  "redirect:/eventResultPage";
        }
        return "index";
    }

    @GetMapping("/formPage")
    public ModelAndView formPage(HttpServletResponse response){
        ModelAndView mv = new ModelAndView("formPage");
        mv.addObject("noEndEvent",  tf.eventTime());
        mv.addObject("sendPhoneNumber", false);
        return mv;
    }

    @PostMapping("/sendPhoneNumber")
    public String sendPhoneNumber (HttpServletRequest request
            ,HttpServletResponse response
            , RedirectAttributes redirectAttributes){
        String phoneNumber = request.getParameter("phone");
        //문자 보내기
        String randomNumber = ps.createRandomNumber();
        ps.sendSMS(phoneNumber,"인증번호는 "+randomNumber+"입니다.");
        //쿠키저장
        long timeLimit = (System.currentTimeMillis() + (5*60)) ;
        cookieFn.setCookie(response,"certificationNumber",60*5, randomNumber);
        redirectAttributes.addAttribute("timeLimit", timeLimit);
        redirectAttributes.addAttribute("phoneNumber", phoneNumber);
        return "redirect:/certificationCheck";
    }
    @GetMapping("/certificationCheck")
    public ModelAndView certificationCheck (HttpServletRequest request ,HttpServletResponse response){
        ModelAndView mv = new ModelAndView("formPage");
        long time =  Long.parseLong(request.getParameter("timeLimit"));
        String certificationNumber = cookieFn.getCookieValue(request, "certificationNumber");
        System.out.println(certificationNumber);
        mv.addObject("noEndEvent",  tf.eventTime());
        mv.addObject("sendPhoneNumber", true);
        mv.addObject("timeLimit", time - System.currentTimeMillis());
        mv.addObject("phoneNumber", request.getParameter("phoneNumber"));
        return mv;
    }

    @PostMapping("/certificationPhone")
    public ModelAndView certificationPhone(HttpServletRequest request){
        ModelAndView mv = new ModelAndView("certificationPage");
        String checkNumber = request.getParameter("certificationNumber");
        //쿠키 인증번호 가져오기
        String certificationNumber = cookieFn.getCookieValue(request, "certificationNumber");
        String phoneNumber = request.getParameter("phoneNumber");
        String text = "";
        if(certificationNumber == null || !certificationNumber.equals(checkNumber)) {
           mv.addObject("certification", false);
        }else{
            //인증번호가 맞으면 로또 번호 랜덤으로 보내기~
            mv.addObject("certification", true);
            int result = ls.registerLotto(phoneNumber);
            if(result == 0){
                text = ("응모가 완료되었습니다. "+phoneNumber+"번호로 로또번호 전달드리겠습니다.");
                String lottoNum = ls.getLottoNumber(phoneNumber);
                ps.sendSMS(phoneNumber,"응모하신 로또 번호는 "+lottoNum+" 입니다.");
            }else if(result == 1){
                text = ("아쉽게도 10,000개의 로또 번호가 소진되었습니다.");
            }else if(result == 2){
                mv.addObject("certification", true);
                text = ("이미 응모한 전화번호 입니다.");
            }
        }
        mv.addObject("text", text);
        return mv;
    }


    @GetMapping("/certificationPhone")
    public ModelAndView noCertificationPhone(){
        ModelAndView mv = new ModelAndView("certificationPage");
        mv.addObject("noCertification", true);
        return mv;
    }

    @GetMapping("/eventResultPage")
    public ModelAndView eventResultPage(HttpServletResponse response){
        ModelAndView mv = new ModelAndView("eventResultPage");
        //발표 날자 전엔 접근 금지
        if(tf.announceStartTime()) mv.setViewName("notFound");
        return mv;
    }


    @GetMapping("/selectMyLotto")
    public ModelAndView selectMyLotto(HttpServletRequest request){
        ModelAndView mv = new ModelAndView("selectMyLotto");
        //발표 날자 전엔 접근 금지
        if(tf.announceStartTime()){
            mv.setViewName("notFound");
            return mv;
        }
        String phone = request.getParameter("phone");
        Lottonumber lr = ls.getLotto(phone);
        System.out.println(lr);
        mv.addObject("lottocheck",lr!=null);
        mv.addObject("lotto", lr);
        mv.addObject("firstLotto",ls.getFristLotto(1));

        return mv;
    }
}
