package remindPractice;

public class Singletonn {

    private static Singletonn singletonn;

    private Singletonn() {

    }

    public static Singletonn getInstance() {
        if (null == singletonn) {
            singletonn = new Singletonn();
        }
        return singletonn;
    }

}

class NewSingleton {
    public static void main(String[] args) {
        Singletonn obj1 = Singletonn.getInstance();
        Singletonn obj2 = Singletonn.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
