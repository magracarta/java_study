package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";
        //split()
        String[] splitStr = str.split(",");

        for(String x : splitStr){
            System.out.println(x);
        }

        String joinStr = "";
        for(String x : splitStr){
            joinStr += x +"-";
        }

        System.out.println("joinStr = "+joinStr);

        //join()
        String joinedStr = String.join("-","A","B","V");
        System.out.println("연결된 문자열 = "+ joinedStr);


        //문자열 배열 연결
        String result = String.join(",",splitStr);
        System.out.println(result);



    }
}
