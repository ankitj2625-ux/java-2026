package Practice.ReturnStatement;

public class Multi {

    public int multi(int a, int b) {
        int c = a * b;
        return c;
    }

    public static void main(String[] args) {
        Multi multi = new Multi();
        int output = multi.multi(5, 3);
        System.out.println(output);
    }
}
