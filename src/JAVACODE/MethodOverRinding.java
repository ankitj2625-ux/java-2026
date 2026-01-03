package JAVACODE;

class Jiva {
    public String print() {
        return "i am ankit";
    }
}

class Dhoni extends Jiva {
    @Override
    public String print() {
        return super.print();
    }
}

public class MethodOverRinding {
    public static void main(String[] args) {

        Dhoni d = new Dhoni();
        System.out.println(d.print());

    }
}
