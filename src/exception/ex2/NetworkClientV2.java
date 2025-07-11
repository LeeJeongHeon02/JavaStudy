package exception.ex2;

public class NetworkClientV2 {

    private final String address;
    private boolean connectError;
    private boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 {
        if (connectError) {
            throw new NetworkClientExceptionV2(address + " 서버 연결 실패", "connectError");
        }
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String userData) throws NetworkClientExceptionV2 {
        if (sendError) {
            throw new NetworkClientExceptionV2(address + " 서버 데이터 전송 실패 " + userData, "sendError");
        }
        // 데이터 전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + userData);
    }

    public void disconnect() {
        System.out.println(address + "서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
