package lambda;

interface StringLam {
    String comapre(String s1, String s2);
}

public class Main {
    public static void main(String[] args) {
        StringLam stringLam = (a, b) -> a.length() > b.length() ? a : b;

        String result = stringLam.comapre("hello", "world");
        System.out.println(result);

    }
}
