package codeCodeCode;


interface Aa
{
  void show();
}
interface Bb
{
    void print();

}
class Ok implements Aa, Bb
{

    @Override
    public void show() {
        System.out.println("ankit");
    }


    @Override
    public void print() {
        System.out.println("jibhakate");

    }
}


public class TestMultipleInheritance {
    public static void main(String[] args) {

       Ok ok = new Ok();
       ok.print();
       ok.show();

    }
}
