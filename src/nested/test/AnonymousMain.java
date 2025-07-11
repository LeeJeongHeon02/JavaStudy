package nested.test;

public class AnonymousMain {
    public static void main(String[] args) {

        // 여기에 Hello의 익명 클래스를 생성하고 hello()를 호출.
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };
        hello.hello();
    }
}
