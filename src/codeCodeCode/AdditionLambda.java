package codeCodeCode;

@FunctionalInterface
interface   Addition {
    int add(int a, int b);
}

public class AdditionLambda {
    public static void main(String[] args) {

        Addition addition = (a, b) -> a + b;
        int sum = addition.add(5, 3);
        System.out.println(sum);
    }
}
