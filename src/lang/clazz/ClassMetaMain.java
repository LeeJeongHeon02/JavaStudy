package lang.clazz;

import java.lang.reflect.Field;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception{
        Class clazz = String.class; // 클래스에서 조회
        Class clazz2 = new String().getClass();
        Class clazz3 = Class.forName("java.lang.String");

        //모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field.getName() = " + field.getName());
        }

        // 상위 클래스 정보 출력
        System.out.println("Superclass" + clazz.getSuperclass().getName());
    }
}
