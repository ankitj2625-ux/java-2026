package lambda;

interface CheckEqual {

    boolean check(int a, int b);
}

public class EqualityChecker {
    public static void main(String[] args) {

        CheckEqual checkEqual = (a, b) -> a == b;
        boolean result = checkEqual.check(5, 6);
        System.out.println(result);


    }
}
