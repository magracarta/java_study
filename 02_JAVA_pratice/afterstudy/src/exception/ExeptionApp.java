package exception;

public class ExeptionApp {
    public static void main(String[] args) {
        System.out.println(1);

        int [] scores = {10,20,30};
        try {
            System.out.println(2);
//            System.out.println(scores[3]);
            System.out.println(3);
            System.out.println(2/0);
            System.out.println(4);
        }catch (ArithmeticException e){
            System.out.println("계산이 잘못된것 같아요."+e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e){ //공통의 조상이기 때문에 그 하위의 오류는 사용 x
            System.out.println("먼가 이상합니다. 오류가 발생했습니다.");
        }finally {

        }


        System.out.println(5);

    }
}
