package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.sound();

        //crtl + alt + n : 생성자 가져오기
        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};


        //변하지 않는 부분
        for (Animal animal : animalArr) {
            //ctrl + alt + m : 자동으로 메서드 만들어주는 기능
            soundAnimal(animal);
        }


    }

    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
