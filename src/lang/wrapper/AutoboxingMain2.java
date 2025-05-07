package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        int value = 7;
        Integer boxingValue = value;

        int unboxedValue = boxingValue;

        System.out.println(boxingValue);
        System.out.println(unboxedValue);
    }
}
