package abstraction;

interface Demo {
    public String getName(String name);

    public static String staticMethod() {
        return "this is static method call";
    }

    public default int sum(int a, int b) {
        int c;
        return c = a + b;
    }

    class Output implements Demo
    {

        @Override
        public String getName(String name) {
            return name ;
        }

        @Override
        public int sum(int a, int b) {
            return Demo.super.sum(a, b);
        }
    }

}

public class StaicAndDefaultMethods {
    public static void main(String[] args) {

        System.out.println(Demo.staticMethod());

        Demo.Output output = new Demo.Output();
        System.out.println(output.getName(" ankit"));
        System.out.println(output.sum(5, 10));
    }
}
