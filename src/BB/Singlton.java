package BB;

public class Singlton {
    private static Singlton singlton;
    private Singlton() {

    }

    public static Singlton getInstance()
    {
        if(null==singlton)
        {
            singlton=new Singlton();
        }
        return singlton;
    }
}
