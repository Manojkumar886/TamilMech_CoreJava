package fundamentaljava.ControlStructure;

import java.util.Scanner;

/**
 * DemoNestedIf
 */
public class DemoNestedIf 
{

    public static void main(String[] args) 
    {

        Scanner scan=new Scanner(System.in);

        System.out.println(" tell as which type of games your wish to play");
        String basedongames=scan.nextLine();

        if(basedongames.equals("water"))//outerblock
        {
            System.out.println(" you are choose to water games theme park \n WOnderla \n Black Thunder layout @ 5 ");
            System.out.println(" what is you weight");
            double weight=scan.nextDouble();
            if(weight>24.9 && weight<=54.9)//inner block
            {
                System.out.println(" you play all water games including fun full slide games also...!");
            }
            else
            {
                System.out.println(" you play only artifial beaches and swemming pool ,giant wheel and extra dry games will play...!");
            }

        }
        else
        {
            System.out.println(" you are choose to based on "+basedongames+" games only play");
        }
        
    }

    
}