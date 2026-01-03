package designPattern;

interface Jibhakate {
    public String surname();
}

class Ankit implements Jibhakate {

    @Override
    public String surname() {
        return "Ankit Jibhakate";
    }
}

class Usha implements Jibhakate {

    @Override
    public String surname() {
        return "Usha Jibhakate";
    }
}

class CreateFactory {
    public static Jibhakate getName(String byName) {
        if (byName.equalsIgnoreCase("Ankit Jibhakate")) {
            return new Ankit();
        } else if (byName.equalsIgnoreCase("Usha Jibhakate")) {
            return new Usha();
        }

        return null;
    }

}


public class FActoryDesignPattern {
    public static void main(String[] args) {

        Jibhakate jibhakate = CreateFactory.getName("Ankit Jibhakate");
        System.out.println(jibhakate.surname());

        Jibhakate jibhakate1 = CreateFactory.getName("Usha Jibhakate");
        System.out.println(jibhakate1.surname());

    }
}
