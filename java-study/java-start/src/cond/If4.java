package cond;

public class If4 {
    public static void main(String[] args) {
        int itmePrice = 10000;
        int age = 10;
        int dicount = 0;
        if(itmePrice >= 10000){
            System.out.println("10000원 이상 할인 1000");
            dicount +=1000;
        }

        if(age <= 10){
            System.out.println("어린이 할인 1000");
            dicount += 1000;
        }

        System.out.println("총 할인 가격은 "+dicount);

    }
}
