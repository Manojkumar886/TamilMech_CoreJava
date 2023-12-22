package fundamentaljava.Constructor;

public class ConstructorOverload
{
    public ConstructorOverload()    //No-parameterized Constructor
    {
        System.out.println(" Most important interview ques: what is constructor overloading");
    }
    public ConstructorOverload(int a)  //parameterized COnstructor
    {
        System.out.println(a);
    }
    public ConstructorOverload(String name)
    {
        System.out.println(name);
    }

    public static void main(String[] args) 
    {
        ConstructorOverload over1=new ConstructorOverload();

        ConstructorOverload over2=new ConstructorOverload(55);

        ConstructorOverload over3=new ConstructorOverload(" Manojkumar");
        
    }
}
