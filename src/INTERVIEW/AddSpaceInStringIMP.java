package INTERVIEW;

public class AddSpaceInStringIMP {
    public static void main(String[] args) {
        String str = "mynameiskhan";

        String result = str.substring(0, 2) + " " +
                str.substring(2, 6) + " # " +
                str.substring(6, 8) + " " +
                str.substring(8);
        System.out.println(result);

    }
}
