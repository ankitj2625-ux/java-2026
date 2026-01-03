package JAVACODE;

import java.util.ArrayList;
import java.util.List;

class ListAdd {
    public List<String> addItems(List<String> stringList) {
        stringList.add("ankit");
        stringList.add("bhaurao");
        stringList.add("jibhakate");
        return stringList;
    }
}


public class ListAddMethodCall {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        ListAdd add = new ListAdd();
      List<String> a =  add.addItems(list);
        System.out.println(a);
    }
}
