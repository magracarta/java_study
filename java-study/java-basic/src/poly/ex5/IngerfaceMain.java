package poly.ex5;


public class IngerfaceMain {
    public static void main(String[] args) {
        InterfaceAnimal dog = new Dog();
        InterfaceAnimal cat = new Cat();
        InterfaceAnimal caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(InterfaceAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        animal.move();
        System.out.println("동물 소리 테스트 끝");
    }
}
