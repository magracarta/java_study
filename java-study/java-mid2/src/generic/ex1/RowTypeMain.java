package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //GenericBox<ObjectBox> intBox = new GenericBox();

        integerBox.set(10);

        System.out.println("integerBox = " + integerBox);

    }
}
