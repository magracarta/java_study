package exeption.ex2;


public class NetworkServiceV2_2 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV2 client=new NetworkClientV2(address);

        client.intiError(data); //추가

        try {
            client.connect();
        } catch (NetWorkClientExceptionV2 e) {
            System.out.println("오류[] 코드 : " + e.getEroorCode() + ", 메세지 : " + e.getMessage());
            return;
        }
        try {
            client.send(data);
        } catch (NetWorkClientExceptionV2 e) {
            System.out.println("오류[] 코드 : " + e.getEroorCode() + ", 메세지 : " + e.getMessage());
            return;
        }
        client.disconnect();
    }
}
