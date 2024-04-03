package sec1;

public class Application {
    /*
    * 박싱과 언박싱
    * 자료형을 객체화 하여 안에 값을 넣고 빼서 사용
    * wrapper 라고한다.
    * */

    /*
    * byte => Byte
    * short = > Short
    * int => Integer
    * long => Long
    * float =>Float
    * double => Double
    * char => Character
    * boolean => Boolean
    * */

    public static void main(String[] args) {
        int intValue = 20;
        Integer integerBox = new Integer(intValue);
        Integer integerBox2 = Integer.valueOf("20");
        Integer integerBox3 = intValue;

        System.out.println(integerBox == integerBox3);
        System.out.println(integerBox == integerBox2);
        System.out.println(integerBox2 == integerBox3);

        // 원시값과 비교하게되면 자동적으로 언박싱해버린다.
        System.out.println(intValue == integerBox);

        int unboxing = integerBox2.intValue(); //언박싱




    }





    
}
