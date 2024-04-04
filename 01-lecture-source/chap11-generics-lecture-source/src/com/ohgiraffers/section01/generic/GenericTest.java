package com.ohgiraffers.section01.generic;

public class GenericTest <T> {
                        //어떤타입을 넣을지 모르겠지만 가상타입을 지정한다
    /* 내용을 넣을때 객체 타입을지정되어있는 값만 넣을 수 있다. */
    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }




}
