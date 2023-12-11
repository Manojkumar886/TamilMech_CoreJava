package fundamentaljava.Arrays;

import java.util.Scanner;

/**
 * Two_d
 */
public class Two_d 
{
    public static void main(String[] args) 
    {
        // //                     0row    1row    2row 
        //  int [][]  mydatas={ {1,2,3},{5,6,7},{8,9,7}};  
        // // column             0 1 2   0 1 2   0 1 2


        // for(int row=0;row<=2;row++)
        // {
        //     for(int col=0;col<=2;col++)
        //     {
        //         System.out.print ( mydatas[row][col]+" ");
        //     }
        //     System.out.println();
        // }

        char [][] letters=new char[3][4];

        // letters[0][3]='G';
        // letters[2][3]='M';
        // letters[1][1]='A';

        for(int row=0;row<=2;row++)
        {
            for(int col=0;col<=3;col++)
            {
                Scanner scan=new Scanner(System.in);
                System.out.println(" current row "+row+"column no is :"+col);
                System.out.println(" enter any letter");
                letters[row][col]=scan.next().charAt(0);
            }
        }


        for(int row=0;row<=2;row++)
        {
            for(int col=0;col<=3;col++)
            {
                System.out.print( letters[row][col]+" ");
            }
            System.out.println();
        }





    }   
}