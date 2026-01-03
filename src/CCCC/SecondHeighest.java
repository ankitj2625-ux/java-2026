package CCCC;

import java.util.Arrays;
import java.util.List;

public class SecondHeighest {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5,3,6,9,4,2,1,0,2,5,5,7);

        System.out.println(integerList.stream().distinct().sorted().skip(1).findFirst());
    }
}
