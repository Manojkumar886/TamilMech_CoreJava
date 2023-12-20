package fundamentaljava.Constructor;

public class NoArguments 
{
    public NoArguments()
    {
        System.out.println(" Constructor is Special Method..run at Initialize an Object");
    }

    public void Checking()
        {
            System.out.println(" without return type method");
        }
    public static void main(String[] args) 
    {
        NoArguments arg=new NoArguments(); //initialize An Object    
    }
}
