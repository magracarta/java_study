package generic.animall;

public class Aniamll {
    private String name;
    private int age;

    public Aniamll(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void sound(){
        System.out.println("동물 울음 소리");
    }

    @Override
    public String toString() {
        return "Aniamll{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
