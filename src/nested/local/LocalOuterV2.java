package nested.local;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    public void process(int param) {
        int localVar = 1;

        class LocalPrinter implements Printer {

            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);
                System.out.println("value=" + localVar);
                System.out.println("value=" + param);
                System.out.println("value=" + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV2 = new LocalOuterV2();
        localOuterV2.process(2);
    }
}
