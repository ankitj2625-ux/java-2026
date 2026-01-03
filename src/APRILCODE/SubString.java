package APRILCODE;

public class SubString {
    public static void main(String[] args) {
        String str = "mynameiskhan";
        String newString = "id-" + str.substring(0, 2) + "-"
                + str.substring(2, 6) + "-"
                + str.substring(6, 8) + "-"
                + str.substring(8);

        System.out.println(newString);
    }
}


