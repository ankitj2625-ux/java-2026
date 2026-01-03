package JAVACODE;

class A {
    public String print() {
        return "ankit jibhakate";
    }
}


class B {
    public String print2() {
        return "usha jibhakte";
    }
}

public class Employee {


    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.print());

        B b = new B();
        System.out.println(b.print2());

    }
}
