package codeCodeCode;

interface Add {
    int sum(int a, int b);
}

public class SampleCode {
    public static void main(String[] args) {

        Add addition = ((a, b) -> a + b);
        int result = addition.sum(5, 6);
        System.out.println(result);
    }
}
