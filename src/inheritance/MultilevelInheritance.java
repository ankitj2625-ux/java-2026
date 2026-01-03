package inheritance;

class Name {
    void name() {
        System.out.println("class name : ankit");
    }
}

class SurnameName extends Name {
    void surName() {
        System.out.println("class surname : jibhakate");
    }
}

class Address extends SurnameName {
    void address() {
        System.out.println("class address : kondha - kodara");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Address address = new Address();
        address.name();
        address.surName();
        address.address();


    }
}
