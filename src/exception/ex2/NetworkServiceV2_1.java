package exception.ex2;

public class NetworkServiceV2_1 {

    public void sendMessage(String input) throws NetworkClientExceptionV2 {
        String address = "https://example.com/";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(input); //추가
        
        client.connect();
        client.send(input);
        client.disconnect();
    }
}
