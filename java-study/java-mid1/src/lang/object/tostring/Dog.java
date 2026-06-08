package lang.object.tostring;

public class Dog {
    private String dogName;
    private int age;

    public Dog( String dogName,int age) {
        this.age = age;
        this.dogName = dogName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}
