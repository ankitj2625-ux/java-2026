package methodCall;

class Demo
{
    public  int sum(int a, int b)
    {
        int c ;
        return c = a+b;
    }

    public String printName()
    {
        return "ankit jibhakate";
    }
}



public class InstanceMethodCall {
    public static void main(String[] args) {

        Demo d = new Demo();
        System.out.println(d.sum(5, 30));
        System.out.println(d.printName());

    }
}
