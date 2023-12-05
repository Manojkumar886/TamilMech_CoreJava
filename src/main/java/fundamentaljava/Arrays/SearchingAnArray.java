package fundamentaljava.Arrays;

import java.util.Scanner;

public class SearchingAnArray 
{

    public static void main(String[] args) 
    {   int count=0;
        char [] alphaletters={'F','A','Z','A','L','P','R','A','D','E','E','P'}; 

        Scanner scan =new Scanner(System.in);
        System.out.println(" what is your favoriate letter");
        char favletter=scan.next().charAt(0);
        for( int i=0;i<alphaletters.length;i++)
        {
            if(alphaletters[i]==favletter)
            {
                System.out.println(favletter+" letter is founded @ :"+i);
                return;
            }
            else{
                System.out.println("not founded");
            }
        }

        // for(int i=0;i<alphaletters.length;i++)
        // {
        //     if(alphaletters[i]=='A')
        //     {
        //         count++;
        //     }
        // }
        // System.out.println("my array of charcter A letter count is :"+count);
    }
}
