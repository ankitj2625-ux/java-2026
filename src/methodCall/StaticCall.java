package methodCall;

class Normal {

    public static String getName() {
        return "ankit you are selected in best MNC having 27 LPA";
    }
}

public class StaticCall {
    public static void main(String[] args) {


        System.out.println(Normal.getName());
    }
}
