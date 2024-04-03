package com.ohgiraffers.section02.String;

public class Application1 {
    public static void main(String[] args) {
        /* String 클래스에 자주 사용하는 메소드에 대해 숙지하고 응용할 수 있다. */
        /*
        * charAt() : 해당 문자열의 인덱스의 해당하는 문자를 반환한다.
        * 인덱스는 0부터 시작하는 숫자체계를 의미하며
        * 인덱스를 벗어난 정수를 인자로 전달하는 경우 indexOutBoundException이 발생한다.
        *
        *  */

        String str = "apple";

        for(int i = 0; i < str.length(); i++){
            System.out.println("charAt("+i+") : "+ str.charAt(i));
        }

        /*
        * compareTo() : 인자로 전달된 문자열과 사전 순으로 비교하여
        * 두 문자열이 같으면 0을 반환, 인자로 전달한 문자열보다 작으면 음수를
        * 크면 양수를 반환한다.
        * 단, 이 메소드는 대소문자를 구분하여 비교한다.
        * */

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("comparedTo() : "+ (str2.compareTo(str3))); //0
        //사전적으로는 같으나 대문사 소문자의 차이로 비교가 되어 다르다. (글자 하나하나로 비교)
        System.out.println("comparedTo() : "+ (str4.compareTo(str2))); //-32 작으면 음수
        System.out.println("comparedTo() : "+ (str2.compareTo(str4))); //32 크면 양수를

        System.out.println("comparedTo() : "+ (str2.compareTo(str5))); // -5
        System.out.println("comparedTo() : "+ (str5.compareTo(str2))); //  5

        /* concat() : 문자열에 인자로 전달한 문자열을 합치기 해서 새로운 문자열을 반환한다
        * 원본 문자열에 영향을 가지 않는다.
        *  */

        System.out.println("concat() : " +(str2.concat(str5)));
        System.out.println("str2 : "+str2);

        /*
        * indexOf : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다.
        * 단, 일치하는 문자가 없는 경우 -1
        * */

        String indexOf = "java oracle";
        System.out.println("indexOf('a') : " + indexOf.indexOf('a')); //1
        System.out.println("indexOf('z') : " + indexOf.indexOf('z')); //-1


        /*
        * lastIndexOf() : 문자열 탐색을 뒤에서부터하고 처음 일치하는 위치의 인덱스를 반환한다.
        * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
        * */

        System.out.println("lastIndexOf('a')"+indexOf.lastIndexOf('a')); //7
        System.out.println("lastIndexOf('z')"+indexOf.lastIndexOf('z')); //-1


        /* trim() :  문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다. */
        String trimStr = "  java  "; //앞 뒤 공백 3칸
        System.out.println("trimStr = #" + trimStr+"#");
        System.out.println("trimStr = #" + trimStr.trim()+"#");

    }
}
