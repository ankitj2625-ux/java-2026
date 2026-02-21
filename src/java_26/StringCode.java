package java_26;

public class StringCode {
    public static void main(String[] args) {
        String a = "Ankit";
        String b = "ankit";
        String c = "Ankit";
        String d = "ankitt";
//        System.out.println(a == b);
//        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a == c);
        System.out.println(a.equals(d));
    }
}
