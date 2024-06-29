package generic.animall;

public class Cat extends Aniamll {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("냐옹");
    }
}
