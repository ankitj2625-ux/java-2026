package methods.FullPrograms;

public class MC1 {
    public void name() {
        System.out.println("ankit");
    }

    public String surname() {
        return "jibhakate";
    }

    public static void main(String[] args) {
        MC1 mc1 = new MC1();
        mc1.name();
        String s1 = mc1.surname();
        System.out.println(s1);
    }
}
