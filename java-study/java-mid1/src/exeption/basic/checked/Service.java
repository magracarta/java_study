package exeption.basic.checked;

public class Service {
    Client client = new Client();

    /*
    * 예외를 찹아서 처리하는 코드
    * */
    public  void  callCatch(){
        try {
            client.call(); //폭탄
            System.out.println("엥");
            //Exception = MyException
        }catch (Exception e){
            //예외 처리 로직
            System.out.println("예외 처리, message ="+e.getMessage());
        }

        System.out.println("정상 흐름");
    }

    /*
    * 체크 예외를밖으로 던지는 코드
    * 체크예외는 예외를 잡지않고 밖으로 던지려면 thorws 예외를 메서즈에 필수로 선언해야한다.
    * */
    public void catchThrow() throws MyCheckedException{
        client.call();
    }
}
