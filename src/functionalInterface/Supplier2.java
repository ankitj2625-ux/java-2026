package functionalInterface;

import java.util.function.Supplier;

public class Supplier2 {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "hello!! well come to the supplier Example ";

        System.out.print(supplier.get());
    }
}
