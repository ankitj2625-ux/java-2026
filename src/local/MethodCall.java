package local;

public class MethodCall {

    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodCall mc = new MethodCall();
        System.out.println(mc.add(10, 20));

    }
}
