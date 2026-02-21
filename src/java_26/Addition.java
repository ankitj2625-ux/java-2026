package java_26;

public class Addition {

    int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {

        Addition addition = new Addition();
        int sum = addition.add(1, 2);
        System.out.println(sum);
    }
}
