package abstraction;

interface Name {
    public abstract void getName(String name);
}

class AA implements Name {

    @Override
    public void getName(String name) {
        System.out.println(name);

    }
}

public class Code1 {

    public static void main(String[] args) {

        AA aa = new AA();
        aa.getName("ankit jibhakate");
    }
}

