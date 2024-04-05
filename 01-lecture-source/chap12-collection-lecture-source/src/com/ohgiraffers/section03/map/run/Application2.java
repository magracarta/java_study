package com.ohgiraffers.section03.map.run;

import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {
        /*
        * Properties란?
        * HashMap을 구현하여 사용 용법이 거의 유사하지만 모두 문자열만 사용 할 수 있는 자료구조이다.
        * 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용한다.
        * */

        /* 드라이브, userId, suerPw 등등을 설정한다는 의미로 프로젝트에서 아주 중요하게 쓰인다. */
        /* 자바와 db를 연결해주는 작업에 필요한 내용 JDBC  */

        Properties prop = new Properties();
        prop.setProperty("driver", "oracle.jdbc.dir.driver.OracleDriver");
        prop.setProperty("url", "jdbc : oracle : thin : @1237.0.0.1:1521:xe");
        prop.setProperty("user","student");
        prop.setProperty("password" , "student");

        System.out.println("prop = " + prop);

        System.out.println(" ==============");

        /* 키값으로 벨류값을 불러옴. */
        System.out.println(prop.getProperty("driver"));
        System.out.println(prop.getProperty("url"));
        System.out.println(prop.getProperty("user"));
        System.out.println(prop.getProperty("password"));


    }
}
