package reviseCode.String;

public class Java11String {
    public static void main(String[] args) {
        String str = "   Java 11   ";

        System.out.println(str.strip());         // 'Java 11'
        System.out.println(str.stripLeading());  // 'Java 11   '
        System.out.println(str.stripTrailing()); // '   Java 11'
//--------------------------------------------------------------
        System.out.println(str.isBlank());
//----------------------------------------------------------

        String multilineString = "Hello\nWorld\nJava 11";

        multilineString.lines().forEach(System.out::println);

    //-------------------------------------------------------------

        System.out.println(str.repeat(2));


        //stream
        //repaet
        //is blank
        //

    }
}

