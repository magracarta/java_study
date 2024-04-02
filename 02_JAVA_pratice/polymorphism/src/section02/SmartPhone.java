package section02;

public class SmartPhone extends Product {
    public String ddd="dd";
    public SmartPhone() {

    }

    public SmartPhone(int nonStaticField, String ddd) {
        super(nonStaticField);
        this.ddd = ddd;
    }

    @Override
    public void setNonStaticField(int nonStaticField) {
        super.setNonStaticField(nonStaticField);
    }

    @Override
    public int getNonStaticField() {
        return super.getNonStaticField();
    }

    @Override
    public void nonStaticMethod() {
        System.out.println("오버라이 딩한값");
    }


    @Override
    public void absMehod() {
        System.out.println("abstract로 가져온 값");
    }

    public void addSamrtPhoneFn(){
        System.out.println("자체적으로 추가");
    }


    @Override
    protected void dkfkf() {
        super.dkfkf();
    }
}
