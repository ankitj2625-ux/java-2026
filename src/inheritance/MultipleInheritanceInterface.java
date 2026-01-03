package inheritance;

interface Ankit {
    void name();
}

interface Jibhakate {
    void surname();
}

class Power implements Ankit, Jibhakate {

    @Override
    public void name() {
        System.out.println("ankit");
    }

    @Override
    public void surname() {
        System.out.println("jibhakate");
    }

    public static String Fitness() {
        return "I love gym";

    }

    public String getCardio(String str) {
        return str;
    }
}

public class MultipleInheritanceInterface {
    public static void main(String[] args) {
        Power power = new Power();
        power.name();
        power.surname();

        String oo = Power.Fitness();
        System.out.println(oo);

        String runningCardio = power.getCardio("Cardio is very good for heart");
        System.out.println(runningCardio);

    }
}
