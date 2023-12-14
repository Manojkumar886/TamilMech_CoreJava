package fundamentaljava.Inheritance.Hybrid;

public class Animal extends Birds implements cat,dog
{
    public void dogtest()
    {
        System.out.println(" dog is good pet animal");
    }

    public void cattest()
    {
        System.out.println(" cat also good animal in home");
    }

    public static void main(String[] args) 
    {
        Animal ani=new Animal();

        ani.cattest();
        ani.listofBirds();
        ani.dogtest();
    }    
}
