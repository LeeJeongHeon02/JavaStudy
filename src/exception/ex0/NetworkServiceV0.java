package exception.ex0;

public class NetworkServiceV0 {

    public void sendMessage(String input) {
        String address = "https://example.com/";
        NetworkClientV0 client = new NetworkClientV0(input);

        client.connect();
        client.send(input);
        client.disconnect();
    }
}
