package lambda;

public interface Adder {

    int add(int a, int b);

    public static void main(String[] args) {
        Adder adder = (a, b) -> a + b;

        int result = adder.add(5, 10);
        System.out.println("Sum is: " + result);
    }
}
