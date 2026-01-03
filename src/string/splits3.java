package string;

public class splits3 {
    public static void main(String[] args) {
        String path = "/home/user/documents/file.txt";
        String[] res = path.split("/");
        for (String op :res)
        {
            System.out.println(op);
        }
    }
}
