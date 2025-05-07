package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] splitString = email.split("@");
        System.out.println("ID: " + splitString[0]);
        System.out.println("Domain: " + splitString[1]);
    }
}
