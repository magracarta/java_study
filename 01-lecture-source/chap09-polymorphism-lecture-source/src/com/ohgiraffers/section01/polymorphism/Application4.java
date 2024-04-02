package com.ohgiraffers.section01.polymorphism;

public class Application4 {

    public static void main(String[] args) {
        /* 다형성을 적용하여 리턴타입을 활용할 수 있다. */
        /* 1. getRandmAnimal()추가 */

        /* 2. getRandmAnimal()호출 */
        Application4 app4 = new Application4();
        Animal randomAnimal = app4.getRandomAnimal();

        randomAnimal.cry();
        System.out.println(randomAnimal instanceof Rabbit);

        Animal [] arra = new Animal[]{
                new Rabbit(),
                new Tiger(),
                new Rabbit()

        };
        for (Animal x : arra){
            x.eat();
            if(x instanceof Rabbit){
                ((Rabbit)x).jump();
            }else if(x instanceof Tiger){
                ((Tiger)x).bite();
            }
        }



    }

    public Animal getRandomAnimal(){
        int random = (int)(Math.random()*2);
        return random == 0? new Rabbit() : new Tiger();
    }
}

