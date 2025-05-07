package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String start = str.substring(0, 5);
        String end = str.substring(5, 9);
        System.out.println(start);
        System.out.println(end);
    }
}
