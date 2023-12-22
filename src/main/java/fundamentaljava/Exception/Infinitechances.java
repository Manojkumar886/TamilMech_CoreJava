package fundamentaljava.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Infinitechances 
{
    static Scanner scan=new Scanner(System.in);
    public static void infinite()
    {   
        String content="looping is used to repeat a set of instruction again to again.";
      try
      {     
            System.out.println(" starting index :");
            int start_index=scan.nextInt();
            System.out.println("ending index :");
            int end_index=scan.nextInt();
            System.out.println(content.substring(start_index,end_index));
      }
      catch(StringIndexOutOfBoundsException ime)
      {
        System.out.println(" lenght is over..!"+ime);
        infinite();
      } 
    }    
    public static void main(String[] args) 
    {
        infinite();    
    }
}
