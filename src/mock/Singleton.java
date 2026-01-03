package mock;

class Show {
    private static Show show;

    private Show() {

    }

    public static Show getInstance() {
        if (null == show) {
            show = new Show();
        }
        return show;
    }
}

public class Singleton {
    public static void main(String[] args) {

        Show obj1 = Show.getInstance();
        Show obj2 = Show.getInstance();
        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));
    }
}
