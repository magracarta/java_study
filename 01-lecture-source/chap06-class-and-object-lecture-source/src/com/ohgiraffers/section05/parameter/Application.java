package com.ohgiraffers.section05.parameter;

public class Application {
    public static void main(String[] args) {
        /* 메소드의 파라미터에 대해 이해하고 사용할 수 있다. */

        /*
        *  매개변수(parameter)로 사용 가능한 자료형
        * 1. 기본자료형
        * 2. 기본 자료형 배열
        * 3. 클래스 자료형
        * 4. 클래스 자료형 배열
        * 5. 가변인자
        * */

        /* 인스턴스 생성 */
        ParameterTest pt = new ParameterTest();

        /* 1. 기본자료형을 매개변수로 전달받는 메소드 호출확인 */
        int num = 10;
        pt.testPrimaryType(num);


        /* 2. 기본자료형 배열을 매개변수로 전달 받는 매소드 호출 확인 */
        int[] iarr = new int[]{1,2,3,4,5,6,7,8};
        System.out.println("인자로 전달하는 값 = "+iarr);
        pt.testPrimaryTypeArray(iarr);



        System.out.println("원본값 출력");
        for(int x:iarr){
            System.out.print(x+" ");
        }
        System.out.println();


        /* 3. 클래스 자료형 */
        RectAngle r1 = new RectAngle(1.5,2.5);
        System.out.println("인자로 전달하는 값 : "+ r1);
        pt.testCallsType(r1);

        System.out.println("변경 후 사각혀의 넓이와 둘레 ==========");
        r1.calArea();
        r1.calcRound();
        
        /* 4. 클래스 자료형 배열은 뒤에 다룬다. */


        /* 5. 가변인자 */
        System.out.println("가변인자!!!!! ==========");
        System.out.println();
        pt.testVariableLengthArray("홀길동");
        pt.testVariableLengthArray("심사임당", "볼링");//한개도 전달가능...
        pt.testVariableLengthArray("김민주", "밥먹기","놀기","???");

        String [] hobby = new String[]{"밥먹기", "놀기","영화보기","게임하기"};
        pt.testVariableLengthArray("누군가", hobby);
        
        //배열도가능
        pt.testVariableLengthArray("아무개",new String[]{"테니스","축구","배구"});


    }
}
