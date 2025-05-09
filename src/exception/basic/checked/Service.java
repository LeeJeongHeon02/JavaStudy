package exception.basic.checked;

public class Service {
    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
            //MyCheckedException 은 Exception을 상속받으므로 Exception을 catch해도 MyCheckedException을 catch함.
        } catch (Exception e) {
            // try에서 예외가 발생하면, 예외처리하는 로직
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정상 흐름으로 돌아옴.");
    }

    public void callThrow() throws MyCheckedException {
        client.call();
    }
}
