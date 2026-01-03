package reviseCode;

public class Singletone {

    private static Singletone singletone;

    private Singletone() {

    }

    public static Singletone getInstance() {
        if (null == singletone) {
            singletone = new Singletone();
        }
        return singletone;
    }
}

class A {
    public static void main(String[] args) {
        Singletone obj1 = Singletone.getInstance();
        Singletone obj2 = Singletone.getInstance();
        System.out.println(obj1 == obj2);
    }
}
