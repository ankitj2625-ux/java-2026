package list;

import java.util.ArrayList;
import java.util.List;

public class base3 {
    public static void main(String[] args) {
        List<String> carBrand =  new ArrayList<>();
        carBrand.add("BMW");
        carBrand.add("AUDI");
        carBrand.add("TOYOTA");
        carBrand.add("RAM");
        System.out.println(carBrand);

        if(carBrand.contains("AUDI"))
            System.out.println("audi is in the car list");
        else
            System.out.println("AUDI is not in the car list");
    }
}
