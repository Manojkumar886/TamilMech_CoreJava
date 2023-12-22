package fundamentaljava.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import fundamentaljava.Inheritance.Hybrid.cat;

public class ExecuteofException 
{
    public static void main(String[] args) 
    {
        // UnChecked Exception 
        // 1)ArithmeticException -anything diveded by zero
        // 2)InputMismatchException

        try
        {
            Scanner scan=new Scanner(System.in);
            System.out.println(" enter A value");
            int A=scan.nextInt();
            System.out.println(" enter B value");
            int B=scan.nextInt();

            System.out.println(A/B);  //100/0
        }
        catch(ArithmeticException ae)
        {
            System.out.println(" your B value is Zero,Anything no diveded by zero occured to Arithmetic Exception");
        }
        catch(InputMismatchException ime)
        {
            System.out.println(" im declare integer datatype...please enter numbers only...!");
        }
        finally
        {
            System.out.println(" Thank you...!");
        }
    }    
}
