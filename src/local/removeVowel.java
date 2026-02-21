package local;

public class removeVowel {
    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println(input.replaceAll("[aeiouAEIOU]", ""));
    }
}
