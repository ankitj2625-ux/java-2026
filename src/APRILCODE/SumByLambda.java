package APRILCODE;

public interface SumByLambda {

    int sum(int a, int b);


    public static void main(String[] args) {

        SumByLambda sumByLambda = (a, b) -> a + b;

        int total = sumByLambda.sum(2, 6);
        System.out.println(total);

    }
}
