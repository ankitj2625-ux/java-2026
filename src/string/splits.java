package string;

public class splits {
    public static void main(String[] args) {
        String s = "ankit1223raha132131vamika";
        String[] str = s.split("\\d+");
        for (String ss : str)
        {
            System.out.println(ss);
        }
    }
}
