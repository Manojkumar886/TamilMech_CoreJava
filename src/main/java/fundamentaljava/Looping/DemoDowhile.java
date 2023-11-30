package fundamentaljava.Looping;

public class DemoDowhile 
{

    // initia;
    //  do {   
        // statement
        // incre/decre
    //  }while(condition);
    public void dow(int n)
    {
        do
        {
            if(n%2==0)
            {
                System.out.println(n+"even number");
            }
            else
            {
                System.out.println(n+" odd number");
            }
            n+=2;
        }while(n>=90);
        
    }

    public static void main(String[] args) 
    {   
        DemoDowhile whi=new DemoDowhile();
        whi.dow(80);
        
    }
    
}
