package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodCall {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 6, 9, 8, 7, 5, 7, 10);
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> zx = list.stream().filter(op -> op % 2 == 0).collect(Collectors.toList());
        for (Integer num : zx) {
            emptyList.add(num);
        }
        System.out.println(emptyList);

    }
}
