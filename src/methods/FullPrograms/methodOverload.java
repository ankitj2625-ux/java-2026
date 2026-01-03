package methods.FullPrograms;

public class methodOverload {

    public void name(String s) {
        System.out.println("this is my name : " + s);
    }

    public void surname(String s1) {
        System.out.println("this is my surname : " + s1);
    }

    public static void main(String[] args) {
        methodOverload methodOverload = new methodOverload();
        methodOverload.name("ankit");
        methodOverload.surname("jibhakate");

    }
}
