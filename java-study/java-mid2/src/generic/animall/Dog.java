package generic.animall;

public class Dog extends Aniamll {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
