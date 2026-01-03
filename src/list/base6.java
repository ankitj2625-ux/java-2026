package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class base6 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("radar");
        words.add("level");
//        words.add("world");
        words.add("madam");

        List<String> integerList = new ArrayList<>(words);

        Collections.reverse(integerList);
        System.out.println(integerList);

        Boolean checkPallindrom = words.equals(integerList);
        System.out.println(checkPallindrom);

    }
}
