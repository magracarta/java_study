package lang.string.method;

public class StringSplitMain {

    public static void main(String[] args) {
        String str ="Apple,Banana,Orange";

        //split()
        String [] splitStr = str.split(",");
        for(String s: splitStr){
            System.out.println(s);
        }

        String joinStr = "";
        for(String s: splitStr){
            joinStr += s + "-";
        }
        System.out.println(joinStr);
        //join
        String join = String.join("-", splitStr);
        System.out.println(join);


    }
}
