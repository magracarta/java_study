package cond;

public class If3 {
    public static void main(String[] args) {
        int age = 7;

        //기존 if 문은 반복적으로 작성할대 불필요한 조건 검사를 하게된다.
        //코드의 효율성이 떨어진다. -> 결과적으로 코드가 중복 체크를 하게 되는 것이다.
        if(age <= 7){
            System.out.println("미취학");
        }
        if(age>=8 && age <= 13){
            System.out.println("초등학생");
        }
        if(age >= 14 && age <= 16){
            System.out.println("중학생");
        }
        if(age >= 17 && age <= 19){
            System.out.println("고등학생");
        }
        if(age >=20){
            System.out.println("성인입니다.");
        }

        //if else는 위조건이 참이면 아래조건들은 수행을 안한다. (불필요한 코드는 작동 X)
        if(age <= 7){
            System.out.println("미취학");
        }else if( age <= 13){
            System.out.println("초등학생");
        }else if( age <= 16){
            System.out.println("중학생");
        }else if(age <= 19){
            System.out.println("고등학생");
        }else{
            System.out.println("성인입니다.");
        }


    }
}
