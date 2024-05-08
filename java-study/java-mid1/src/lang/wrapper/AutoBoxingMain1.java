package lang.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        //Primitive => wrapper
        int value = 7;
//        Integer boxedValue = Integer.valueOf(value);
        Integer boxedValue = value; //오토 박싱 (Auto-boxing)

        //Wrapper -> primitive
        //int unboxedValue = boxedValue.intValue();
        int unboxedValue = boxedValue; //오토 언박싱(Auto-unboxing)

        System.out.println("boxedValue = "+boxedValue);
        System.out.println("unboxedValue = "+unboxedValue);
    }
}
