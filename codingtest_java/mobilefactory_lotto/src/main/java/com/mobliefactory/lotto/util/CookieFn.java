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
    public void setCookie(final HttpServletResponse response, final String name, long second , String value) {
        Cookie firstvisiteCookie = new Cookie(name,value);
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

    //쿠키 값 꺼내기
    public String getCookieValue(HttpServletRequest request, String name) {
        Cookie[] cookies = request.getCookies();  // 모든 쿠키 가져오기
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(name)) { // 쿠키 이름 확인
                    return cookie.getValue();  // 해당 쿠키 값 반환
                }
            }
        }
        return null; // 해당 쿠키가 없으면 null 반환
    }
}
