package fundamentaljava.Exception;

import java.util.Scanner;

public class Execute2 
{
    public static void main(String[] args) 
    {
        // 3)NullPointerException
        // 4)ArrayIndexOutOfBoundsException
        // 5)StringIndexOutOfBoundsException

        try
        {
            String [] fruitsnames={"Apple","banana","Graphs","Watermelon","PineApple","lemon"};
            Scanner scan =new Scanner(System.in);
            System.out.println(" which index of value you want");
            int index=scan.nextInt();
            System.out.println(fruitsnames[index]);
            System.out.println(" which index of position mentioned value you wants");
            System.out.println(fruitsnames[index].substring(10, 16));
        }
        catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException stobe)
        {
            System.out.println(" your array length is "+stobe.getMessage());
        }
        finally
        {
            System.out.println(" Bye byee...!");
        }
        
        // try
        // {
        //     String  name=null;
        //     System.out.println(name.length());    
        // }
        // catch(NullPointerException npe)
        // {
        //     System.out.println(" your array value is null");
        // }
    }    
}
