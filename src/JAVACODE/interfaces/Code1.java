package JAVACODE.interfaces;
interface Animal
{
    public String getname();
}
class Dog
{
    public String DogName()
    {
        return "DOG";
    }
}

class Tiger extends Dog implements Animal
{
    public String tiger()
    {
        return "Tiger";
    }

    @Override
    public String getname() {
        return "I am from interface : I am Loin";
    }
}


public class Code1 {
    public static void main(String[] args) {

//     Dog d = new Dog();
//        System.out.println(d.DogName());

        Tiger tiger = new Tiger();
        System.out.println(tiger.getname());
        System.out.println(tiger.DogName());
        System.out.println(tiger.tiger());

    }
}
