package collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;
    static void main() {
        //char
        char charA = 'A';
        char charB = 'B';
        System.out.println("CharA = " + charA);
        System.out.println("CharB = " + charB);

        //hashCode
        System.out.println("hashCode(\"A\") = " + hashCode("A"));
        System.out.println("hashCode(\"B\") = " + hashCode("B"));
        System.out.println("hashCode(\"AB\") = " + hashCode("AB"));
        System.out.println("hashCode(\"1\") = " + hashCode("1"));


        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));
        System.out.println("hashIndex(1) = " + hashIndex(hashCode("1")));

    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
