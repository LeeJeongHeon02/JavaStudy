package exception.ex2;

public class NetworkServiceV2_4 {

    public void sendMessage(String inputData) {
        String address = "https://example.com/";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(inputData); //추가

        try {
            client.connect();
            client.send(inputData);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }
        // NetworkClientExceptionV2이 아닌 예외가 발생하지 않으면 실행.
        // 예를들어, RuntimeException이 발생하면, 위에서 catch하지 못하므로 실행 X.
        client.disconnect();
    }
}
