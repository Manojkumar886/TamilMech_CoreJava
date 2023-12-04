package fundamentaljava.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ListingAnArray 
{
    public static void main(String[] args)
    {
        String [] MasalaNames =new String[6];

        for(int pos=0;pos<MasalaNames.length;pos++)
        {
            Scanner scan=new Scanner(System.in);
            System.out.println(" Enter your masala name :");
            MasalaNames[pos]=scan.next();
        }

        // To-string
        System.out.println(Arrays.toString(MasalaNames));

        // For -each Loop   
        // for(String Masala : MasalaNames)
        // {
        //     System.out.println(Masala);
        // }

        
        // For -loop 
        // for(int i=0;i<MasalaNames.length;i++)
        // {
        //     System.out.println(MasalaNames[i]);
        // }
        
    }
}
