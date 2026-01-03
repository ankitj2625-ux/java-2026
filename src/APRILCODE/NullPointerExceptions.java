package APRILCODE;

public class NullPointerExceptions {
    String name;

    void getName() {
        System.out.println(name.toUpperCase());
    }

    public static void main(String[] args) {
        NullPointerExceptions nullPointerExceptions = new NullPointerExceptions();
        nullPointerExceptions.getName();
    }
}
