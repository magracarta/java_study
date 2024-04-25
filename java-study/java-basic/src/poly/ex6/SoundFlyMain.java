package poly.ex6;


public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chiken chiken = new Chiken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chiken);


    }
    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        animal.move();
        if(animal instanceof Fly){
            ((Fly) animal).fly();
        }
        System.out.println("동물 소리 테스트 끝");
    }
}
