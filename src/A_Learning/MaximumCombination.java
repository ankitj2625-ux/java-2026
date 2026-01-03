package A_Learning;

public class MaximumCombination {
    public static void main(String[] args) {
        String str = "ABC";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                System.out.println(str.charAt(i) + "" + str.charAt(j));

                //2nd code

              /*  String str = "A,B,C";
                String[] arr = str.split(",");

                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        System.out.println(arr[i] + arr[j]);
                    }
                }*/

            }
        }
    }
}
