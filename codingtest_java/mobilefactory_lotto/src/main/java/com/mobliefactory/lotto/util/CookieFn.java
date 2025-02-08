package com.mobliefactory.lotto.util;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Repository;

@Repository
public class CookieFn {
    //쿠키 확인
    public boolean checkCookie(HttpServletRequest request , String cookieText) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(cookieText))return false;
            }
        }
        return true;
    }

    //쿠키 등록
    public void setCookie(final HttpServletResponse response, final String name, long second) {
        Cookie firstvisiteCookie = new Cookie(name,"false");
        firstvisiteCookie.setMaxAge((int)second);
        response.addCookie(firstvisiteCookie);
    }

    public void removeCookie(HttpServletResponse response, String name){
        //테스트 쿠키 삭제
        Cookie firstVisiteCookie = new Cookie(name,"true");
        firstVisiteCookie.setMaxAge(0);
        firstVisiteCookie.setPath("/");
        response.addCookie(firstVisiteCookie);
    }
}
