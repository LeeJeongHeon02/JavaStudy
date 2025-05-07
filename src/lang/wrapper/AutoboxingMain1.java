package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        int value = 7;
        Integer boxingValue = Integer.valueOf(value);

        int unboxedValue = boxingValue.intValue();

        System.out.println(boxingValue);
        System.out.println(unboxedValue);
    }
}
