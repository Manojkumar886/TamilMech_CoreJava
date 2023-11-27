package fundamentaljava.ControlStructure;

import java.util.Scanner;

/**
 * Demoelseif
 */
public class Demoelseif 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println(" please enter your age :");
        int age =scan.nextInt();

        if(age<12)
        {
            System.out.println(" you played only dry games...!");
        }
        else if (age>=12 && age<=55)
        {
            System.out.println(" you played dry and water games ...!");
        }
        else if ( age >55 && age <=65)
        {
            System.out.println(" you played only dry games");
        }
        else
        {
            System.out.println(" you are not allowed any games just watching games only");
        }  
    }
}