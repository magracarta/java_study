package com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Subclass extends SuperClass {
    /*
    @Override
    public void method() {} //정상 - 예외없이 오버라이딩 가능
    */
    
    /* 같은 예외를 던져주는 구문으로 오버라이딩 해야한다. */
    /*
    @Override
    public void method() throws IOException{} //throws를 superClass랑 같다

     */


    /* 부모의 예외처리 클래스보다 상위 예외로는 후손 클래스에서 오버라이딩 할 수 없다. */
    /* 부모의 예외 클래스가 IO인데 서브 클래스 메소드 처리를 exception으로 하는것이
    * SuperClass보다 상위 예외라서 오버라이딩 불가. 부모보다 더 상위클래스이면 안된다.
    *  */
    /*
    @Override
    public void method() throws Exception{} //오류
    */

    /* 부모의 예외처리보다 하위예외인 경우 오버라이딩 할 수 있다. */
    @Override
    public void method() throws FileNotFoundException{
        //하위의 요소는 오버라이딩하여 사용할 수 있다.

    }
}
