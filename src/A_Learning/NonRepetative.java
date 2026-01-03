package A_Learning;

public class NonRepetative {
    public static void main(String[] args) {
        String str = "ankitjibhakate";
        for (char ch : str.toCharArray())

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println(ch);
                break;
            }
    }
}
