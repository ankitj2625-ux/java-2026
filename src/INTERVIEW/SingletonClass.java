package INTERVIEW;

public class SingletonClass {

    private static SingletonClass singletonClass;

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        if (null == singletonClass) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

}

class Remote {
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();

        System.out.println(obj1 == obj2);
    }
}
