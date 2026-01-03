package list;

import java.util.ArrayList;
import java.util.List;

public class base1 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(4);
        integerList.add(21);
        integerList.add(15);
        integerList.add(31);
        integerList.add(65);
        System.out.println(integerList);

        for (int result : integerList)
        {
            System.out.println(result);
        }
    }
}
