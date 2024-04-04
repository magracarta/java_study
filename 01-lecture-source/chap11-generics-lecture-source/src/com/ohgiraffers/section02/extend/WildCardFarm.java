package com.ohgiraffers.section02.extend;

public class WildCardFarm {
    /* 매개변수로 전달받는 토끼농장을 구현할 때 사용한 타입 변수에 대해 제한할 수 있다. */

    public void anyType(RabbitFarm<?> farm){
        // 상한선이 없다 위아래로 다가능!
        farm.getAnimal().cry();

    }
    public void extendsType(RabbitFarm<? extends  Bunny> farm){ //상한제한
        //버니나 술취한 버니만 가능 (기준에서 자식계열만)
        farm.getAnimal().cry();
    }

    public void superType(RabbitFarm<? super Bunny> farm){ //하한제한
        //바니이거나 그부모로만들어진 토끼만 가능 (기준에서 부모계열만)
        farm.getAnimal().cry();
    }



}
