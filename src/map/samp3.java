package map;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class samp3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("ankit", "radha", "anamika");
        Optional<Integer> totalLength = stringList.stream().map(String::length).reduce(Integer::sum);
        System.out.println(totalLength);
    }
}
