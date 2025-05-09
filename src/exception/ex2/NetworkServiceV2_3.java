package exception.ex2;

public class NetworkServiceV2_3 {

    public void sendMessage(String inputData) {
        String address = "https://example.com/";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(inputData); //추가

        try {
            client.connect();
            client.send(inputData);
            client.disconnect(); // 위에서 예외가 발생하면 실행안됨.
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }
    }
}
