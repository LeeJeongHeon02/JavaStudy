package nested.annonymous.ex;

import java.util.Random;

public class Ex1RefMainV5 {
    
    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        //코드 조각 시작
        process.run();
        //코드 조각 종료
        System.out.println("프로그램 종료");
    }

// main 함수
    public static void main(String[] args) {

// lambda를 활용해서 클래스나 인스턴스를 정의하지 않고, 메서드의 코드 블럭을 직접 전달
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("randomValue = " + randomValue);
        });

        hello(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}
