package lang.immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {
        Address address = new Address("서울");
        Address bddress = new Address("서울");
        System.out.println("a = " + address);
        System.out.println("b = " + bddress);
        
        bddress.setValue("부산");
        System.out.println("a = " + address);
        System.out.println("b = " + bddress);

    }
}
