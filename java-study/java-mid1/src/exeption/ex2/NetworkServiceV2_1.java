package exeption.ex2;


public class NetworkServiceV2_1 {
    public void sendMessage(String data) throws NetWorkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client=new NetworkClientV2(address);

        client.intiError(data); //추가

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
