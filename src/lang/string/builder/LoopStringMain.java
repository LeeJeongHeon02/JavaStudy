package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java ";
        }

        long endTime = System.currentTimeMillis();
        System.out.println(result);
        System.out.println("소요시간" + (endTime - startTime));
    }
}
