package ref;

public class Varchange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA의 참조값은 = "+ dataA); //ref.Data@b4c966a
        System.out.println("dataB의 참조값은 = "+ dataB); //ref.Data@b4c966a
        System.out.println(dataA.value); //10
        System.out.println(dataB.value); //10


        //DataA 변경
        dataA.value = 20;
        System.out.println(dataA.value); //20
        System.out.println(dataB.value); //20
        //같이 변경된다. 같은 주소값을 가리키고 있기떄문이다.

        dataB.value =30;
        System.out.println(dataA.value);
        System.out.println(dataB.value);


    }
}
