package section01;

public class Main {
    public static void main(String[] args) {

        Animal rabbit = (Animal) new Rabbit(); // 업 캐스팅
        rabbit.cry();

        ((Rabbit)rabbit).eat();

        Rabbit rabbit1 = ((Rabbit)rabbit); //다운 캐스팅

        rabbit.cry();


    }
}
