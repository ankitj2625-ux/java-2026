package A_Learning;

interface Addition {
    int add(int a, int b);
}

public class LambdaAddition {
    public static void main(String[] args) {

        Addition addition = ((a, b) -> a + b);
        int result = addition.add(5, 5);
        System.out.println(result);

    }
}
