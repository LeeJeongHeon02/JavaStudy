package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();

        child.childMethod();
        child.parentMethod();
        //toString는 Object클래스의 메서드이다. 객체의 정보를 제공함.
        String s = child.toString();
        System.out.println(s);
    }
}
