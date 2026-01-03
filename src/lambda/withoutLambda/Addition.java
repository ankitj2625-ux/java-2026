package lambda.withoutLambda;

public class Addition {
    public static void main(String[] args) {

        System.out.println(Addition.add(5, 9));
    }

    public static int add(int a, int b)
    {
        int c = a+b;
        return c;
    }
}
