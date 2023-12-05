package fundamentaljava.Arrays;

import java.util.Scanner;

public class ReadingAnArray 
{
    public static void main(String[] args)
    {   
        char [] alphaletters={'F','A','Z','A','L','P','R','A','D','E','E','P'};
        
        // System.out.println(alphaletters[5]);

        System.out.println("which index of value you want to commit  :");
        Scanner scan=new Scanner(System.in);

        int pos=scan.nextInt();

        System.out.println(alphaletters[pos]);
        
    }
}
