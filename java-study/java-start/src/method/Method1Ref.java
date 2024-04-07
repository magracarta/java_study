package method;

import static java.lang.Integer.valueOf;

public class Method1Ref {

    public static void main(String[] args) {
        //계산 1

        Method1Ref m = new Method1Ref();
        Integer a = 5;
        Integer b = 123;

        System.out.println("결과 출력");
        String integerNum3 = "20";
        String integerNum4 = "100";
        Integer sum = m.add(integerNum3 ,b);
        System.out.println(sum);
    }

    public <T> int add (T a, T b){
        int sum;
        System.out.println(a instanceof Integer);
        int x,y;
        if(a instanceof Integer){
            x= ((int)a);
        }else{
            x = Integer.parseInt((String) a);
        }

        if(b instanceof Integer){
            y = ((int)b);
        }else{
            y = Integer.parseInt((String) b);
        }

        sum = (Integer.valueOf(x)+Integer.valueOf(y));
        return  Integer.valueOf(sum);
    }


}
