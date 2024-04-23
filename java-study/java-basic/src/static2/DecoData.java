package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        //instanceValue++; //인스턴스 변수 접근, compile error
        //insttanceMethod(); //인스턴스 메서드 접근, compile error
        staticValue++; //정적변수 접근
        staticMethod();
    }
    public void instanceCall(){
        instanceValue++;
        insttanceMethod();

        staticValue++; //정적변수 접근
        staticMethod();

    }

    private void insttanceMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceCall();
    }
}
