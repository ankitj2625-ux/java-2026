package classes;
class Car
{
  public String name()
  {
      return "ankit";
  }
}
class BMW extends Car
{
    public int num(int a)
    {
        return a;
    }
}
public class Inheritance {
    public static void main(String[] args) {

        BMW b = new BMW();
        System.out.println(b.num(10));
        System.out.println(b.name());
    }
}
