package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    //인스턴스 변수는 LocalOuterV3인스턴스가 GC되기 전까지 생존.
    private int outInstanceVar = 3;

    public Printer process(int param) {
        //process의 지역 변수, 스택 프레임이 종료되는 순간 함께 제거됨.
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
        // printer.print();
        return printer;

    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV3 = new LocalOuterV3();
        Printer printer = localOuterV3.process(2);
        printer.print();
        printer.print();

        //추가, printer의 구성 요소 확인
        System.out.println("필드 확인");
        Field[] declaredField = printer.getClass().getDeclaredFields();
        for (Field field : declaredField) {
            System.out.println("field = " + field);
        }
    }
}
