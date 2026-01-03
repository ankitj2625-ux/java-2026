package staticCode;

public class StaticBlock {
    static {
        System.out.println(" 1st");
    }

    static {

        int num = 20;
        System.out.println(num);
        System.out.println("2nd");
    }

    {
        System.out.println("instance 1st");
    }

    static {
        int val = 10;
        System.out.println(val);
        System.out.println("3nd");
    }

    {
        System.out.println("instance 2nd");
    }

    public static void main(String[] args) {


        StaticBlock staticBlock = new StaticBlock();
    }
}
