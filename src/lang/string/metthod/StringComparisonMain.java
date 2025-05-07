package lang.string.metthod;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!"; //일부 대문자
        String str2 = "hello, java!"; //대문자 없음
        String str3 = "Hello, World!";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println("j".compareTo("w"));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareToIgnoreCase(str2));

        System.out.println(str1.startsWith("Hello"));
        System.out.println(str1.endsWith("Java!"));
    }
}
