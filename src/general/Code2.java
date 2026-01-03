package general;
class A
{
 void m()
 {
     System.out.println("form A");
 }
}

class B extends A{
    void m()
    {
        System.out.println("form B");
    }

}
public class Code2 {
    public static void main(String[] args) {

        A a = new B();
        a.m();

//        B b = (B) new A();
//        b.m();
    }
}
