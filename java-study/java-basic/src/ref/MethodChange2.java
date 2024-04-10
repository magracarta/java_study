package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.value =10;
        System.out.println("메서드 호출 전 : dataA.value = "+ data1.value);
        changePrimitive(data1);
        System.out.println("메서드 호출 후 : dataA.value = "+ data1.value); //참조값이기 때문에 변경된다!!!
    }


   static void changePrimitive(Data datax ){
        datax.value = 30;
    }
}
