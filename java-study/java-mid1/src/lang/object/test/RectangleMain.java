package lang.object.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RectangleMain {
    public static void main(String[] args) {
        Object rect1 = new Rectangle(120,20);
        Object rect2 = new Rectangle(100,20);

        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect1 == rect2);
        System.out.println(rect1.equals(rect2));
        List<Rectangle> rects = new ArrayList<>();

        rects.add((Rectangle) rect1);
        rects.add((Rectangle) rect2);

        System.out.println(rects);
        rects.sort(new Comparator<Rectangle>() {
            @Override
            public int compare(Rectangle o1, Rectangle o2) {
                return o1.getWidth() - o2.getWidth();
            }
        });

        System.out.println(rects);
    }
}
