package JAVACODE;

class Animal {
    void dog() {
        System.out.println("dog");
    }

}

class Frog extends Animal {
    void frog() {
        System.out.println("frog");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {

        Frog a = new Frog();
        a.frog();
        a.dog();
    }
}
