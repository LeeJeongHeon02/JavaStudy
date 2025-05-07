package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int countResult = 0;

        while (true) {
            int idx = str.indexOf(key);
            if (idx == -1) {
                break;
            } else {
                str = str.substring(idx + 1);
                countResult++;
            }
        }
        System.out.println("count = " + countResult);

    }
}
