package exception.ex2;

public class NetworkServiceV2_5 {

    public void sendMessage(String inputData) {
        String address = "https://example.com/";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(inputData); //추가

        try {
            client.connect();
            client.send(inputData);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
