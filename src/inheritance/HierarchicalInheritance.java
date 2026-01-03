package inheritance;
class Bmw
{
    void bmw()
    {
        System.out.println("bmw");
    }
}
class Audi extends Bmw
{
    void audi()
    {
        System.out.println("audi");
    }
}
class Tata extends Bmw
{
    void tata()
    {
        System.out.println("tata");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Tata tata = new Tata();
        tata.tata();
        tata.bmw();

        Audi audi =new Audi();
        audi.audi();
        audi.bmw();
    }
}
