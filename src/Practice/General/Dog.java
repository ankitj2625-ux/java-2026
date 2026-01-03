package Practice.General;

public class Dog {
    private String name;
    private int id;


    Dog(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Dog d = new Dog("madhumitha");
        d.displayName();

    }
}
