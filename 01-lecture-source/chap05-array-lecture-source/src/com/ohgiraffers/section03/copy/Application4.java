package com.ohgiraffers.section03.copy;

public class Application4 {
    public static void main(String[] args) {
        /* 배열의 깊은 복사를 사용한 자바문법을 이해하고 활용할 수 있다. */
        /*
        * 깊은 복사는 원본과 복사본 중 둘 중 한가지 값을 변경해도 다른 하나에 영향을 주지않는다.
        * 값은 값을 가지고 있는 거로 다른 배열이기 떄문이다.
        * */

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1.clone();

        for(int i =0; i<arr1.length; i++){
            arr1[i] += 10;
        }

        for(int i =0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }


        /* 향상된 for문 : jdk 1.5버전부터 추가되었다.
        * 배열 인덱스에 하나씩 차례로 담긴 값을 임시로 가용할 변수에 담고 반복문을 실행한다.
        * */

        System.out.println();
        for(int i : arr2){ //향상된 for문은 배열에 접근은 할수 있으나 값이 변경은 안됨
            i+=10;
            System.out.print(i+" / ");
        }




        System.out.println();
        for(int i : arr2){
            //변경 목적 X , 출력 목적으로 사용이 주
            System.out.print(i+" / ");
        }

        System.out.println();
        for(int i =0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }



    }
}

