package APRILCODE;

class Present {
    void show() {
        System.out.println("in Show method of present class");
    }
}

class SecondPresent extends Present {
    void show() {
        System.out.println("in show method second class");
    }
}

public class SameMethodName {
    public static void main(String[] args) {

        Present p = new SecondPresent();
        SecondPresent p2 = new SecondPresent();
        p.show();
        p2.show();

    }
}
