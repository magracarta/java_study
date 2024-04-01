package com.ohgiraffers.section03.overriding;

public class SubClass extends SupClass {
    /* 1. 메소드 이름을 변경하면 에러 발생 */
    /*@Override
    public void method2(int num) {
        //super.method(num); 명시적으로 보여주는것

    }*/

    /* 2. 메소드의 리턴타입 변경하면 에러발생 */
    /*
    @Override
    public int method(int num) {
        return 0;
    }*/

    /* 3. 매개변수 갯수나 타입이 변경되면 에러발생 */
    /*
    @Override
    public void method(String num) {
        super.method(num);
    }*/

    /*4. 메소드 이름, 리턴타입, 매개변수의 갯수, 타입, 순서가 일치할 경우 오버라이딩 성립*/
    @Override
    public void method(int num) {
        super.method(num);
    }

    /* 5. private 메소드는 오버라이딩 불가 */
    /*
    @Override //어노테이션
    private void privateMethod(){

    }*/

    /*6. final 메소드는 오버라이딩이 불가하다. */
    /*@Override
    public final void finalMethod(){

    }*/
    /* @Override
    void protetedMethod(){ } //좁은 범위라서 불가*/
    /*
    @Override
    protected void protetedMethod() { // 같은 범위

    }*/

    @Override
    public void protetedMethod() { // 더 넓은 범위로도 가능
        super.protetedMethod();
    }
    /* 참고로 클래스에도 final 키워드를 추가할 수 있는데 이는 상속을 제한하는 키워드이다.(클래스 확장 불가) */


}
