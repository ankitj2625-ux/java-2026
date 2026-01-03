package DEMO;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCountString {
    public static void main(String[] args) {
        String str = "Big black bug bit a big black dog on his big black nose";

        Map<String, Long> stringLongMap = Arrays.stream(str.split("\\s"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry frequencyCount : stringLongMap.entrySet()) {
            System.out.println(frequencyCount.getKey() + " " + frequencyCount.getValue());
        }
    }
}
