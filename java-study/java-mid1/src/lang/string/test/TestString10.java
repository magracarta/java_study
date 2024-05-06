package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String [] fruitArr = fruits.split(",");

        for (String x : fruitArr) System.out.println(x);

        String joinString = String.join("->",fruitArr);
        System.out.println("joinString = "+joinString);

    }
}
