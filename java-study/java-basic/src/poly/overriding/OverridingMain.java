package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> ");
        System.out.println("value = " + child.value);
        child.method();

        //부모 변수가 부모 인스턴스를 참조하는 경우
        Parent parent = new Parent();
        System.out.println("Parent -> ");
        System.out.println("value = " + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스를 참조(다형적 참조)
        Parent child1 = new Child();
        System.out.println("Child -> ");
        System.out.println("value = " + child1.value); //변수는 오버라이딩 X
        child1.method(); //메서드는 오버라이딩 O

        //오버라이딩 메서드는 무조건 우선권을 가진다. 자식, 손자 가 있다면 손자가 제일 우선권 업캐스팅해도 소용 없다.
        //인스턴스 변수는 오버라이딩 되지 않는다.

    }
}
