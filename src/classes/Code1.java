package classes;

abstract class AbstractClass {
    abstract void getName();

    public static final int number = 20;
}

public class Code1 extends AbstractClass {
    @Override
    void getName() {
        System.out.println(" i am ankit ");
        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Code1 code1 = new Code1();
        code1.getName();
        int num = AbstractClass.number;
        System.out.println("static variable : " +num);
    }
}

