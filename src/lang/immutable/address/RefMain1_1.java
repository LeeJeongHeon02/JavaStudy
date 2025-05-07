package lang.immutable.address;

public class RefMain1_1 {

    public static void main(String[] args) {
        Address address = new Address("서울");
        Address bddress = address;
        System.out.println("a = " + address);
        System.out.println("b = " + bddress);
        
        address.setValue("부산");
        System.out.println("a = " + address);
        System.out.println("b = " + bddress);

    }
}
