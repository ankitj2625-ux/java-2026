package methods.FullPrograms;


import java.util.ArrayList;
import java.util.List;

public class ListCalled {

    public static void main(String[] args) {

        List<Integer> list = getListNumber();
        System.out.println(list);

        int endResult = getSumList(list);
        System.out.println(endResult);
    }

    public static List<Integer> getListNumber() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(5);
        integerList.add(9);
        integerList.add(7);
        return integerList;
    }

    public static int getSumList(List<Integer> integerList) {
        int sum = 0;
        for (Integer result : integerList) {
            sum = sum + result;
        }
        return sum;
    }


}
