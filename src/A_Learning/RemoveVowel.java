package A_Learning;

public class RemoveVowel {
    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println(input.replaceAll("[aeiouAEIOU ]", ""));
    }
}
