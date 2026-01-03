package AA;

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
