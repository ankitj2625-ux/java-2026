package functionalInterface;

import java.util.function.Supplier;

public class Supplier3 {

    public static void main(String[] args) {

        Supplier<Integer> randomIntegerSupplier = () -> (int) (Math.random() * 100);
        System.out.println(randomIntegerSupplier.get());

    }
}
