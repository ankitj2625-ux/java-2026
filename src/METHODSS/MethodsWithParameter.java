package METHODSS;

class Sample {
    public int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
public class MethodsWithParameter {
    public static void main(String[] args) {

        Sample sample = new Sample();
        int result = sample.getSum(10, 30);
        System.out.println(result);
    }
}
