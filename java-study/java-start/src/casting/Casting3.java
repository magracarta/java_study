package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int의 최고 값
        long maxIntOver = 2147483648L; //int의 최고 값 overflow
        int invalue = 0;

        invalue = (int) maxIntValue; //형변환
        System.out.println("maxIntOver casting = " + invalue);

        invalue = (int) maxIntOver;
        System.out.println("maxIntOver casting = " + invalue);


    }
}
