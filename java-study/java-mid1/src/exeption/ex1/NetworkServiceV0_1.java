package exeption.ex1;


public class NetworkServiceV0_1 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV1 client=new NetworkClientV1(address);

        client.intiError(data); //추가

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
