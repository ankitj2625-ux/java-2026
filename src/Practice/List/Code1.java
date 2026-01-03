package Practice.List;

import java.util.ArrayList;
import java.util.List;

public class Code1 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("ankit");
        stringList.add("mohan");
        stringList.add("mohan");
        System.out.println(stringList);

        System.out.println("1st line code:" + stringList.remove("mohan"));

        System.out.println(stringList);

        if(stringList.isEmpty())
            System.out.println("List is empty ");
        else
            System.out.println("List is not empty");
    }
}
