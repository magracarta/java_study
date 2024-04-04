package com.ohgiraffers.section02.extend;




//public class RabbitFarm <T implements Animal> { //에러남
//public class RabbitFarm <T extends Animal> { //정상
/*Animlal타입까지만 제한하겠다는 의미
인터페이스이지만 제네릭으로 인터페이스를 상속받을때에는 extends를 사용해야한다.*/

//public class RabbitFarm <T extends Rabbit> { //정상
//public class RabbitFarm <T extends Animal & Rabbit> { //오류
//public class RabbitFarm <T extends Rabbit & Snake> {//클래스클래스는 불가
//public class RabbitFarm <T extends Rabbit , Snake> {
// 둘모두해당된다가 아닌 둘중에 하나만 클래스로 가져와 사용할수 있다는 뜻
//public class RabbitFarm <T extends Rabbit & Animal> { //클래스와 인터페이스 상속
    //클래스가 앞에 인터페이스가 뒤에 와야한다.
    //두개의 클래스 타입이 해당되어야한다.
public class RabbitFarm <T extends Rabbit > { //토끼와 토끼 후손만 가능
    private T animal;
    public RabbitFarm(){}
    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }


}
