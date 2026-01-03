package list;

import java.util.ArrayList;
import java.util.List;

public class base2 {
    public static void main(String[] args) {
        List<String> countryList = new ArrayList<>();
        countryList.add("USA");
        countryList.add("INDIA");
        countryList.add("NORWAY");
        countryList.add("GERMANY");
        countryList.remove(3);

        countryList.set(2, "UK");
        System.out.println(countryList);
    }
}
