package JAVACODE;


class AA {
    public int add(int a, int b) {
        int c = a + b;
        return c;
    }
}

public class Code2 {
    public static void main(String[] args) {

        AA a = new AA();
        System.out.println(a.add(4, 5));


    }
}
