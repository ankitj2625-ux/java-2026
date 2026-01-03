package BB;

public class Palindrom {
    public static void main(String[] args) {
        String s = "MAM";
        String reSt = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reSt = reSt + s.charAt(i);
        }
        System.out.println(reSt);

        if (reSt.equals(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not PALINDROME");
    }
}
