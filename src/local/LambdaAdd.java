package local;

public interface LambdaAdd {
    int add(int a, int b);

    public static void main(String[] args) {
        LambdaAdd lambdaAdd = (a, b) -> a + b;
        int output = lambdaAdd.add(10, 20);
        System.out.println(output);
    }
}
