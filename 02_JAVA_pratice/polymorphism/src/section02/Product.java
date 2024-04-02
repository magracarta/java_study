package section02;

public abstract class Product {
    private int nonStaticField;
    public static int staticField;
    public Product(){}

    public Product(int nonStaticField) {
        this.nonStaticField = nonStaticField;
    }

    public void setNonStaticField(int nonStaticField) {
        this.nonStaticField = nonStaticField;
    }

    public static void setStaticField(int staticField) {
        Product.staticField = staticField;
    }

    public int getNonStaticField() {
        return nonStaticField;
    }

    public static int getStaticField() {
        return staticField;
    }

    public void nonStaticMethod(){
        System.out.println("Product 클래스의 nonStaticMethod 호출함.");
    }

    public static void staticMethod(){
        System.out.println("Product 클래스의 staticMethod 메소드 호출함");
    }

    public abstract void absMehod();

    protected void dkfkf(){
        System.out.println("protected");
    }


}
