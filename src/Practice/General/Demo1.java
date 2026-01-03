package Practice.General;

public class Demo1 {

//    int a =10;
//    int b=20;

    public int addition(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        int add = demo1.addition(10, 20);
        System.out.println(add);
    }
}
