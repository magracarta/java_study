package section03;

public class Product implements InterProduct {
    public Product() {
    }

    @Override
    public void nonStaticMehod() {
        
    }

    @Override
    public void test() {

    }

    @Override
    public void test1() {

    }

    @Override
    public void test3() {
        InterProduct.super.test3();
        System.out.println("추가로 넣은 내용");
    }

}
