package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

import javax.crypto.spec.PSource;

public class Application1 {
    public static void main(String[] args) {
        /* extends 키워드를 이용하여 특정한 타입만을 사용하도록 제네릭 범위에 제한할 수 있다. */

        //RabbitFarm<Animal> farm = new RabbitFarm<Animal>();
        // 오류 제네릭에 Rabbit을 넣었기 때문에 Rabbit또는 Rabbit을 상속받은애만들어감
        //RabbitFarm<Mammal> farm2 = new RabbitFarm<>(); //Rbbit의 부모로 에러
        //RabbitFarm<Snake> farm3 = new RabbitFarm<>(); //불가
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>(); //Rabbit을 상속받은 변수라 가능
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>(); //Rabbit을 상속받은 변수라 가능

        //farm.setAnimal(new Snake());
        farm4.setAnimal(new Rabbit());
        ((Rabbit)farm4.getAnimal()).cry();

        farm4.getAnimal().cry(); //형변환 생략가능

        farm4.setAnimal(new Bunny());
        farm4.getAnimal().cry();

        farm5.setAnimal(new DrunkenBunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().hihi();





    }


}
