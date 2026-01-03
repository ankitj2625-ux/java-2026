package methodCall;

class Name {
    public void getName(String name) {
        System.out.println("my name is  : " + name);
    }
}

public class StringParameter {
    public static void main(String[] args) {

        Name name = new Name();
        name.getName("ankit");
    }
}
