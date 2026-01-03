package JAVACODE;

class Calculator {

    public int num(int a, int b) {
         int c = a + b;
           return c;
    }
}


public class MethodCall {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        System.out.println(cal.num(20, 30));

    }
}
