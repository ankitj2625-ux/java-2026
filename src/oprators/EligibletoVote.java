package oprators;

public class EligibletoVote {
    public static void main(String[] args) {
        int age = 18;
        String natoinality = "indian";

        if (age >= 18 && natoinality.equals("indian"))
            System.out.println("eligible for vote : nationality is = " + natoinality);
        else
            System.out.println("not eligible for vote");
    }
}
