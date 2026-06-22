package lang.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value;

        //Wrapper -> Primitive
        int unBoxedValue = boxedValue;

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unBoxedValue = " + unBoxedValue);

    }
}
