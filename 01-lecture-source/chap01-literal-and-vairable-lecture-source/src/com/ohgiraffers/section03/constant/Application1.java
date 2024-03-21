package com.ohgiraffers.section03.constant;

public class Application1 {
    public static void main(String[] args){
        /* 수업목표. 상수에 대해 이해하고 사용할 수 있다. */
        /* 상수란? */
        /* 변수가 메모리에 변경될 값을 저장하기 위한 공간으로 나타난다면, 산수는 이와 상반되는 개념이다.
        * 변하지 않는 값을(항상 고정된 값)을 저장해두기 위한 메모리상의 공간을 상수라고 한다.
        *
        * 상수의 사용 목적
        * 변경되지 않는 값을 저장하기 위한 목적으로 사용한다.
        * 초기화 이후 값 대입 시 컴파일 에러를 발생시켜 값이 수정되지 못하도록 한다.
        * 예) 수학 공식에 사용되는 수치 등.
        *
        * 사용방법
        * 1. 상수를 선언한다.(변수 선언과 유사하지만 final 키워드를 사용한다.)
        * 2. 값을 초기화 한다.(초기화 이후에는 값 변경이 불가능함)
        * 3. 필요한 위치에 상수를 호출해서 사용한다.
        *
        * */

        /* 1. 상수 선언 */
        /* 상수는 선언시에 final키워드를 붙인다. */
        final int AGE;

        /* 2. 초기화 */
        AGE = 20;
        //AGE = 30; // 한 번 초기화한 이후에는 값을 재대입하는 것은 불가능하다.

        /* 3. 필요한 위치에 상수를 호출하여 사용한다. */
        /* 3-1 출력 구문에서 사용 */
        System.out.println("AGE의 값 : "+AGE);
        /* 3-2 필요시에는 연산식에 호출하여 사용한다. */
        System.out.println("AGE의 2배 : "+(AGE*2));

        /* 3-3 대입연산시 활용 */
        int sum = AGE;      //대입연산자의 오른편에 기술 가능
        //AGE = AGE +10;    //대입연산자의 왼쪽편에는 기술이 불가능
        sum = AGE + 4;
        System.out.println(sum);



    }
}
