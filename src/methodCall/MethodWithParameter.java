package methodCall;

class Parameter {
    public String getName(String firstName, String lastName) {
        return firstName + lastName;

    }
}

public class MethodWithParameter {
    public static void main(String[] args) {

        Parameter parameter = new Parameter();
        System.out.println(parameter.getName("ankit", " jibhakate"));


    }
}
