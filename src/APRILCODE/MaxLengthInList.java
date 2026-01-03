package APRILCODE;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthInList {
    public static void main(String[] args) {
        String names = "Mohan, radhika, arpita, vaishali";

        String maxLength = Arrays.stream(names.split(","))
                .map(String::trim)
                .max(Comparator.comparing(String::length)).orElseThrow();

        System.out.println(maxLength);

    }
}
