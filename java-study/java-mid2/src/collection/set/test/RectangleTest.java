package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class RectangleTest {
    static void main() {
        Set<Rectangle> rectangles = new HashSet<>();
        rectangles.add(new Rectangle(10,20));
        rectangles.add(new Rectangle(20,20));
        rectangles.add(new Rectangle(20,20)); //중복

        for (Rectangle rectangle : rectangles) {
            System.out.println("rectangle = " + rectangle);
        }

    }
}
