package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer i2 = Integer.valueOf(10);
        Long l1 = Long.valueOf(100);
        Double d1 = Double.valueOf(3.14);

        System.out.println(i);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(d1);

        System.out.println("내부 값 읽기");
        int intValue = i2.intValue();
        System.out.println(intValue);
        long longValue = l1.longValue();
        System.out.println(longValue);
    }
}
