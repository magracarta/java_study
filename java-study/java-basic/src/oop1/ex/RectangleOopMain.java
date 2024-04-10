package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {

        Recatangle rectangle = new Recatangle();
        rectangle.width = 5;
        rectangle.height = 8;
        int area = rectangle.calculateArea();
        int perimeter = rectangle.calculatePerimeter();
        boolean square = rectangle.square;

        System.out.println("넓이: " + area);

        System.out.println("둘레 길이: " + perimeter);

        System.out.println("정사각형 여부: " + square);
        System.out.println("\\^---^/");
    }




}
