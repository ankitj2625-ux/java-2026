package general;

public class Variables {

    int instanceVariable = 10;
    static int staticVariable = 20;

    public static void main(String[] args) {

        int methodVariable = 30;
        System.out.println(methodVariable);

        System.out.println(Variables.staticVariable);

        Variables variables = new Variables();
        System.out.println(variables.instanceVariable);
    }
}
