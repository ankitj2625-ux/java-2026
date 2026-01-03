package lambda;

interface Multi {
    int multipleNumber(int a, int b);
}

public class MultiplyNumber {
    public static void main(String[] args) {

        Multi multi = (k1, k2) -> k1 * k2;
        int result = multi.multipleNumber(5, 6);
        System.out.println(result);

    }
}
