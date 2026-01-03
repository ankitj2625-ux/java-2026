package methods.FullPrograms;

public class code1 {
    public static void main(String[] args) {
        int amount = 100000;
        int time = 1;
        int rate = 12;
        code1.getRateOfInterest(amount, time, rate);
    }

    public static void getRateOfInterest(int amount, int time, int rate) {
        System.out.println((amount * time * rate) / 100);
    }
}
