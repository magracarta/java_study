package lang.object.poly;

import java.util.ArrayList;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();

        Object[] objects = {dog, car, object};

        ArrayList<Object> ob = new ArrayList<>();
        ob.add(dog);
        ob.add(car);
        ob.add(object);

        size(objects);
        listSize(ob);
    }

    private static void listSize(ArrayList<Object> ob) {
        System.out.println(ob.size());
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는 : " + objects.length);
    }


}
