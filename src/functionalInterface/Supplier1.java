package functionalInterface;

import java.util.Random;
import java.util.function.Supplier;

public class Supplier1 {
    public static void main(String[] args) {

        Supplier<Integer> sup = () -> new Random().nextInt(50);

        for (int i = 0; i < 10; i++) {
            Integer val = sup.get();
            System.out.println(val);
        }
    }
}
