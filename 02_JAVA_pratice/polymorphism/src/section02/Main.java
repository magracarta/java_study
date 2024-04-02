package section02;

public class Main {

    public static void main(String[] args) {
        Product smartPhone1 = new SmartPhone();
        SmartPhone smartPhone2 = new SmartPhone();


        smartPhone1.staticMethod();
        smartPhone1.setNonStaticField(2);

        Product.setStaticField(3);
        System.out.println(smartPhone1.staticField++);
        System.out.println(Product.staticField);

    }

}
