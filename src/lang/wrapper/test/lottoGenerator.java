package lang.wrapper.test;

import java.util.Arrays;
import java.util.Random;

public class lottoGenerator {
    public static void main(String[] args) {
        int lottoNumber;
        Random random = new Random();
        int[] ints = new int[6];
        
        // 로또 숫자 개수인 6회 반복
        for (int i = 0; i < ints.length; i++) {
            lottoNumber = random.nextInt(1, 46); // 초기값
            // 중복되지 않는 값이 나오면 isSame = false, while 탈출
            while (isSame(lottoNumber, ints)) {
                lottoNumber = random.nextInt(1, 46);
            }
            ints[i] = lottoNumber; //로또 번호 확정, 배열에 저장
        }
        System.out.println("로또 번호 : " + Arrays.toString(ints));
    }
    
    //배열 안에 k라는 숫자가 있는지 확인시켜주는 메서드
    public static boolean isSame(int k, int[] ints) {
        for (int anInt : ints) {
            if (anInt == k) {
                // 배열 내에 중복된 값이 있으면 true
                return true;
            }
        }
        // 배열 안에 중복된 값이 없으면 false
        return false;
    }
}

