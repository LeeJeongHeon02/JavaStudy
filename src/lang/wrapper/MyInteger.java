package lang.wrapper;

public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int k) {
        if (value > k) {
            return 1;
        } else if (value == k) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
