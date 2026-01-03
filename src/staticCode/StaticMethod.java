package staticCode;

public class StaticMethod {

    public static String myName()
    {
        System.out.println("in myName method");
        return "ankit";
    }

    public static void main(String[] args) {
        System.out.println(StaticMethod.myName());
    }
}
