package APRILCODE;

public class UniqueCombinations {
    public static void main(String[] args) {
        String str = "a,b,c,d";
        String[] letters = str.split(",");

        for (int i = 0; i < letters.length; i++) {
            for (int j = i + 1; j < letters.length; j++) {
                System.out.println(letters[i] + letters[j]);
            }
        }
    }
}
