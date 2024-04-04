package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application2 {
    public static void main(String[] args) {

        /* 와일드 카드에 대해 이해할 수 있다.
         * 와일드 카드(Wild Card)
         * 제너릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
         * 그 객체의 타입을 변수로 제한할 수 있다.
         * <?> : 제한 없음
         * <? extend Type> : 와일드카드의 상한 제한(Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 사용 가능)
         * <? super Type> : 와일드카드의 하한제한(Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용 가능)
         *
         * */
        WildCardFarm wildCardFarm = new WildCardFarm();
        //wildCardFarm.anyType(new RabbitFarm<Mammal>(new Rabbit()));
        //<?> 모두가능

        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));


        System.out.println("-----------------------------------------");
        //<? extends> 버니 와 버니 후손으로만 사용 인자로 사용가능
        //wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit())); //에러
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        System.out.println("-----------------------------------------");
        //<? super> 버니 와 버니 부모으로만 사용 인자로 사용가능
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
        //wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny())); //에러


        //작업방향
        /*
            WildcarFarm 객체 생성 (new 생성자로)
            wildCardFarm -> ~Type 메소드 호출 : 타입메서드 안의 매개변수 (생성 클래스)

            RabbitFarm 클래스를 타입으로 넣어야하는데 RabbitFarm은 작성시 매개변수를 또받아야함.
            -> 매개변수는 제너릭으로 클래스 타입을 받음
            그과정에서 wildFarm에서 적용했던 와일드 인자로 다음으로 받을 타입의 위아래 기준선을 받음
            하면서 RabbitFarm을 불러오고 레빗Farm은 또 생성자로Rabbit 생성자를 가지게된다.
            해서 rabbit이 rabbitFarm에 value값으로 Animal에 객체가 들어가게되고 
            wildCardFarm에서 RabbitFarm에 있는 animal.getAnimal() 의 객체를 불러와 결국 bunny객체의 cry를 
            타고타고 들어가서 wildCardFarm에서 호출함
            

        */

    }




}
