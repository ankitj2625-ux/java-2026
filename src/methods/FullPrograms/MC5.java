package methods.FullPrograms;

public class MC5 {
    public static String getName() {
        System.out.println(MC5.getNum());
        return "ankit jibhakate";

    }

    public static int getNum() {
        return 10;
    }

    public static void main(String[] args) {

        String result = MC5.getName();
        System.out.println(result);
    }
}
