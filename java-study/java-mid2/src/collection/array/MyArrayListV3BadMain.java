package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrrayListV3 numberList = new MyArrrayListV3();

        //숫자만 입력하기를 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3");

        System.out.println(numberList);
    }
}
