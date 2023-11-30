package fundamentaljava.Looping;

import java.util.Scanner;

public class DemoFor 
{
    public static void main(String[] args) 
    {

        // for(initia ;condition  ; incre/decre)
        // {
        //     //statement
        // }
        
            // increment
        // for(int start=1;start<=10;start++)
        // {
        //     System.out.println(" Tamil learning java full stack development");
        // }

        // decrement
        // for(int i=10;i>=1;i--)
        // {
        //     System.out.println(" point no :"+i);
        // }

        // Infinite
        // for( ;  ; )
        // {
        //     System.out.println("JAVA");
        // }

        int selectedperson=0;
        for(int vacancy=1;vacancy<=10;vacancy++)
        {
            System.out.println(" current number of person value :"+vacancy);
            Scanner scan=new Scanner(System.in);
            System.out.println(" Enter your Experience");
            float exp=scan.nextFloat();

            if(exp>=2 && exp<=5)
            {
                System.out.println(" your selected ...!");
                selectedperson++;
            }
            else{
                System.out.println(" your not selected....!");
            }
        }

        System.out.println(" selected people count :"+selectedperson);
    }
}
