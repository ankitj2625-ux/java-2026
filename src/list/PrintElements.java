package list;

import java.util.ArrayList;
import java.util.List;

public class PrintElements {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        for (String f : fruits) {
            System.out.println(f);
        }
    }
}
