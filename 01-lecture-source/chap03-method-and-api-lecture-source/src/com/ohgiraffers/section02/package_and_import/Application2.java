package com.ohgiraffers.section02.package_and_import;
import com.ohgiraffers.section01.method.Calculator;
import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;


public class Application2 {
    public static void main(String[] args) {
        /* 수업 목표. 임포트 대해 이해할수 있다. */
        /*
        * 임포트란?
        * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 글래스 이름을 사용해야한다.
        * 하지만 매번 다른 클래스의 패키지명까지 기술하기에는 버거롭다.
        * 그래서 패키지 명을 샐략하고 사용할 수 있도록 한 구문이 import문이다.
        * import는 package 선언문과 class 선언문 사이에 작성하며
        * 어떠한 패키지 내에 클래스를 사용할 것인지 선언하는 효과를 가진다.
        * */
        /* 1. non-static method의 경우 */
        Calculator cal = new Calculator();
        int min = cal.minNumberOf(50,60);
        System.out.println("non-static의 경우 최소값"+min);

        /* 2. static method의 경우 */
        int max = Calculator.maxNumberOf(50,60);
        System.out.println("static의 경우 최대값"+max);

        /* 3. static 메소드를 호출할 때 클래스명을 생략하고 사용할 수 있다.  */
        int max2 = maxNumberOf(100,200); //static 메소드 수동 추가
        System.out.println(max2);

    }
}
