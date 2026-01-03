package staticCode;

public class StaticVariable {
    static final int num = 10+20;

    public static void main(String[] args) {
        System.out.println(GlobalStatic.name);
        System.out.println(GlobalStatic.a);
        System.out.println(GlobalStatic.car);

        System.out.println(StaticVariable.num +110);

    }
}
