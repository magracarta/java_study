package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //GenericBox<Object> genericBox = new GenericBox<Object>();//권장

        integerBox.set(10);
        integerBox.set("sdfsdf");
    }
}
