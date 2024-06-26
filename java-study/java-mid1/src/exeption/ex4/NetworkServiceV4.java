package exeption.ex4;


import exeption.ex4.exception.ConnectExceptionV4;
import exeption.ex4.exception.SendExceptionV4;

public class NetworkServiceV4 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV4 client=new NetworkClientV4(address);

        client.intiError(data); //추가

        try {
            client.connect();
            client.send(data);

        }finally {
            client.disconnect();
        }


    }
}
