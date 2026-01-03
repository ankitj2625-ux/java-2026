package A_Learning;

public class KeyWord {

    public volatile String name = "Ankit";

    public String fullName = "mahesh jibhakate";

    String print() {
        return fullName.toUpperCase();

    }

    public static void main(String[] args) {

        KeyWord keyWord = new KeyWord();
        String result = keyWord.print();
        System.out.println(result);

    }
}
