package mycode;

public class StaticCount {
    static int count =10;
    StaticCount()
    {
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        StaticCount staticCount = new StaticCount();

    }
}
