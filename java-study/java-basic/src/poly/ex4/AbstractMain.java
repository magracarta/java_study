package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        //추상클래스 생성 불가
        //AbstractAnimal animal = new AbstractAnimal();

        //ctl + alt +v 생성자만 만들어도 자동으로 변수명까지 생성해줌
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();
        caw.sound();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        animal.move();
        System.out.println("동물 소리 테스트 끝");
    }
}
