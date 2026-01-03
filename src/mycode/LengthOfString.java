package mycode;

public class LengthOfString {
    public static void main(String[] args) {
        String str = "ma415461haraJ61Aga";
        String h = "321651cgbgj";
        String addplease = "";


        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                addplease += c;
            }
        }
        System.out.println(addplease);


//        for (char c : str.toCharArray()) {
//            if (Character.isDigit(c)) {
//                addplease += c;
//            }
//        }
//        System.out.println(addplease);


    }
}
