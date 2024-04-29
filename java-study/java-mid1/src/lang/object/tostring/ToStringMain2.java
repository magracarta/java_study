package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1",2);
        Dog dog2 = new Dog("멍멍이1",5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());


        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);


        System.out.println("3. object 다형성 활용");
        ObjectPrint.print(car);
        ObjectPrint.print(dog1);
        ObjectPrint.print(dog2);


        String i = Integer.toHexString(System.identityHashCode(dog1)) ;
        System.out.println("i = "+i);
        String i2 = Integer.toHexString(System.identityHashCode(car)) ;
        System.out.println("i2 = "+i2);

    }
}
