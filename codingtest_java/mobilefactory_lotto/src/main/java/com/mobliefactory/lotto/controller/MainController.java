package com.mobliefactory.lotto.controller;

import com.mobliefactory.lotto.DTO.Lottonumber;
import com.mobliefactory.lotto.service.LottoNumberCreateService;
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

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

@Controller
public class MainController {

    CookieFn cookieFn = new CookieFn();
    TimeFn tf = new TimeFn();
    @Autowired
    PhoneService ps;

    @GetMapping("/")
    public String index(HttpServletRequest request, HttpServletResponse response){
        boolean firstVisit = cookieFn.checkCookie(request,"firstVisit");
        //이벤트 기간 중 그리고 하루 중 최초 접속 시 링크 변경
        if( tf.eventTime() && firstVisit){
            //12시 50분 59초에서 현재시간을 뺸다.
            cookieFn.setCookie(response,"firstVisit",tf.calcuTime());
            return  "redirect:/formPage";
        }
        return "index";
    }

    @GetMapping("/formPage")
    public ModelAndView formPage(HttpServletResponse response){
        ModelAndView mv = new ModelAndView("formPage");
        mv.addObject("sendPhoneNumber", false);
        return mv;
    }

    @PostMapping("/sendPhoneNumber")
    public ModelAndView sendPhoneNumber (){
        ModelAndView mv = new ModelAndView("formPage");
        mv.addObject("sendPhoneNumber", true);
        return mv;
    }

    @GetMapping("/certificationPhone")
    public ModelAndView certificationPhone(HttpServletResponse response){
        ModelAndView mv = new ModelAndView("formPage");

        return mv;
    }
}
