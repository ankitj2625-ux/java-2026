package string;

public class splits4 {
    public static void main(String[] args) {
        String data = "Java:is:awesome";
        String[] parts = data.split(":", 3);

        for (String part : parts) {
            System.out.println(part);
        }
    }
}
