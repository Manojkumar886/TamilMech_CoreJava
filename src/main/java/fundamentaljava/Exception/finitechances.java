package fundamentaljava.Exception;

import java.util.Scanner;

public class finitechances 
{
    public void finite(int count)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println(" enter your icici bank pin no :");
        int pinno=scan.nextInt();

        try
        {   
            if(pinno==4545)
            {
                System.out.println(" your pin no is correct");
            }
            else
            {
                throw new Pinnumberwrong();
            }
        }
        catch(Pinnumberwrong pnwe)
        {
            System.out.println(pnwe);
            if(count>=1)
            {
                count--;
                finite( count);
            }
            else
            {
                System.out.println(" maximum chance is over ..! your account is blocked..!");
            }
        }
        
    }
    public static void main(String[] args) 
    {
        

        finitechances chance=new finitechances();
        chance.finite( 3);
    }
    
}
