package methods.FullPrograms;

import java.util.ArrayList;
import java.util.List;

public class ListCalled1 {

    public static List<Integer> getAllNames()
    {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(5);
        return integerList;
    }

    public static void main(String[] args) {

        System.out.println(ListCalled1.getAllNames());
    }
}
