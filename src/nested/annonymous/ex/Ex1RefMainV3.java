package nested.annonymous.ex;

import java.util.Random;

public class Ex1RefMainV3 {
    
    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        //코드 조각 시작
        process.run();
        //코드 조각 종료
        System.out.println("프로그램 종료");
    }

// main 함수
    public static void main(String[] args) {
        //main 함수 안에 익명클래스를 바로 생성
        Process Dice = new Process(){
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("randomValue = " + randomValue);
            }
        };

        Process Sum = new Process() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };
        //여기를 채워보시오
        hello(Dice);
        hello(Sum);
    }
}
