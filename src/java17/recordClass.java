package java17;

import java.io.Serializable;

class Print{

}


record Ankit(int id, String name) implements Serializable, Cloneable {

    private final static String address = "pune";

    public void show()
    {

    }

    public static void ok()
    {

    }

    public String name()
    {
        return "jibhakate";
    }
}

public class recordClass {
    public static void main(String[] args) {
        Ankit a = new Ankit(100, "ankit");
        Ankit b = new Ankit(100, "ankit");
        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(a);
        System.out.println(b);

        System.out.println(a.id());
        System.out.println(b.name());

    }
}
