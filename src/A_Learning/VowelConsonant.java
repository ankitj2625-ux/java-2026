package A_Learning;

public class VowelConsonant {
    public static void main(String[] args) {
        String str = "ankitjibhakate";
        int vovel = 0;
        int consonant = 0;

        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vovel++;
            else
                consonant++;
        }
        System.out.println("vovel " + vovel);
        System.out.println("consonant " +consonant);

    }
}
