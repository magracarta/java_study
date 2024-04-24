package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("===================== parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("===================== parent2 호출");
        call(parent2);

    }

    private static void call(Parent parent){
        parent.parentMethod();
        //child  인스턴스인 경우  childMehod() 실행
        if(parent instanceof Child child) { // instance of로 비교를하면서 바로 변수선언 자바 16부터 사용가능하다.
            System.out.println("Child 인스턴스 맞음");
            child.childMethod(); //child라는게 보장이되어 따로 다운캐스팅을 하지않아도 된다

        }else {
            System.out.println("child가 아닙니다");
        }



    }
}
