package codeCodeCode;

public class RemoveVowel {
    public static void main(String[] args) {
        String input = "Hello World";
        String result = input.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Result: " + result);
    }
}
