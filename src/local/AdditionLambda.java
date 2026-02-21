package local;

public class AdditionLambda {
    int addition (int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        AdditionLambda additionLambda = new AdditionLambda();
       int result =  additionLambda.addition(10,20);
        System.out.println(result);
    }
}
