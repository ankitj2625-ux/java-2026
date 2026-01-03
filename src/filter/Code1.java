package filter;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class Code1 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("ankitjjibha", "ak", "mojhpiahft", "arlkhsnn", " maharana");

        list.stream().filter(i -> i.length() >= 4).forEach(i-> System.out.println(i));
    }
}
