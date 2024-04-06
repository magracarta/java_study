package cond;

public class If6 {
    public static void main(String[] args) {
        int itmePrice = 10000;
        int age = 10;
        int dicount = 0;
        if(itmePrice >= 10000){ //위에가 참이면 아래 코드들이 실행 x라 동시에 실행해야하는 조건들이라면 if문으로만 작성하는게 좋다.
            System.out.println("10000원 이상 할인 1000");
            dicount +=1000;
        } else if (age <= 10){
            System.out.println("어린이 할인 1000");
            dicount += 1000;
        } else {
            System.out.println("할인 없음");

        }
        System.out.println("총 할인 가격은 "+dicount);

        if(true) System.out.println("if문에서 실행됨");
        System.out.println("if문에서 실행됨");

    }
}
