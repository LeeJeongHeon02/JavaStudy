package exception.ex1;

public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        NetworkClientV1 client = new NetworkClientV1("https://example.com");
        client.initError(data); //추가

        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            }
        }
        client.disconnect();
    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}
