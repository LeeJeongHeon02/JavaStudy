package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException {
        // 새로운 MyCheckedException예외를 발생시킨다.
        throw new MyCheckedException("ex");
    }
}
