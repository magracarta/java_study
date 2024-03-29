package com.ohgiraffers.section05.parameter;

public class ParameterTest {
    public void testPrimaryType(int num){
        System.out.println("매개변수로 전달 받은 값 = " + num);
    }


    public void testPrimaryTypeArray(int[] iarr){
        System.out.println("인자로 받은 값 = "+iarr);
        System.out.println("배열이 값 출력 : ");
        for(int x:iarr){
            System.out.print(x+" ");
        }
        System.out.println();
        iarr[0] = 99;
        System.out.println("변경된 값 출력 (원본값이 변경되는 부분)");
        for(int x:iarr){
            System.out.print(x+" ");
        }
        System.out.println();
    }



    public void testCallsType(RectAngle rectAngle){
        System.out.println("매개변수로 전달받은 값 : "+ rectAngle );
        System.out.println("사각형의 넓이와 둘레 =======");

        rectAngle.calArea();
        rectAngle.calcRound();

        rectAngle.setWidth(100);
        rectAngle.setHeight(200);

        System.out.println("변경 후 사각혀의 넓이와 둘레 ==========");

        rectAngle.calArea();
        rectAngle.calcRound();
    }
    //public void testCallsType(RectAngle rectAngle,int i){ }//오버로딩 가능

    public void testVariableLengthArray(String name , String ...hobby){
        System.out.println("이름 : "+ name);
        System.out.println("취미의 개수 : "+ hobby.length);
        System.out.print("취미 : ");
        for (String x:hobby){
            System.out.print(x+"  ");
        }
        System.out.println();
        System.out.println();
    }


    //가변배열을 사용한 메소드는 모호성이 있어 오버로딩을 하지 않는게 좋다. - 오류남
    /*
    public void testVariableLengthArray( String...hobby){

        System.out.println("취미의 개수 : "+ hobby.length);
        System.out.print("취미 : ");
        for (String x:hobby){
            System.out.print(x+"  ");
        }
        System.out.println();
        System.out.println();
    }
     */

}
