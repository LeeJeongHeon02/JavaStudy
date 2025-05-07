package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        int num = integer1.intValue();
        System.out.println("intValue = " + num);

        Integer integer2 = Integer.valueOf(num);
        System.out.println("integer2 = " + integer2);

    }
}
