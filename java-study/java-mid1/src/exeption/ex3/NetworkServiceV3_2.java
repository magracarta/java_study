package exeption.ex3;


import exeption.ex3.exception.ConnectExceptionV3;
import exeption.ex3.exception.NetworkClientExceptionV3;
import exeption.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV3 client=new NetworkClientV3(address);

        client.intiError(data); //추가

        try {
            client.connect();
            client.send(data);

        } catch (ConnectExceptionV3 | SendExceptionV3 e) {
            System.out.println("[연결 또는 전송 오류] 주소 :   메세지 : " + e.getMessage());
        }catch (Exception e){
            System.out.println("[알수 없는 오류] 메세지 : " + e.getMessage());
        } finally {
            client.disconnect();
        }


    }
}
