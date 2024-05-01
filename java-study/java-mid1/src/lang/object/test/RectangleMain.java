package lang.object.test;

public class RectangleMain {
    public static void main(String[] args) {
        Object rect1 = new Rectangle(100,20);
        Object rect2 = new Rectangle(100,20);

        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect1 == rect2);
        System.out.println(rect1.equals(rect2));
    }
}
