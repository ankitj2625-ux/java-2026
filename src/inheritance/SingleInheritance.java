package inheritance;

class A {
    void name() {
        System.out.println("In class A");
    }
}

class B extends A {
    void surname() {
        System.out.println("In class B");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        B b = new B();
        b.surname();
        b.name();
    }
}
