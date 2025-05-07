package exception.ex1;

public class NetworkServiceV1_1 {

    public void sendMessage(String input) {
        String address = "https://example.com/";
        NetworkClientV1 client = new NetworkClientV1(input);
        client.initError(input); //추가
        
        client.connect();
        client.send(input);
        client.disconnect();
    }
}
