package fundamentaljava.Arrays;

import java.util.Scanner;

public class JaggedArray
{
    // static keyword  (static variable ,static method, static block)
    public static void main(String[] args)
    {
        int [][]  mydatas=new int[4][];
        mydatas[0]=new int[4];
        mydatas[1]=new int[2];
        mydatas[2]=new int[3];
        mydatas[3]=new int[2];

        int count=0;
        // assign your datas

        for(int row=0;row<mydatas.length;row++)
        {
            for(int col=0;col<mydatas[row].length;col++)
            {   
                count+=2;
                mydatas[row][col]=count;
            }
        }


        // Print jagged Array
        for(int row=0;row<mydatas.length;row++)
        {
            for(int col=0;col<mydatas[row].length;col++)
            {   
                System.out.print(mydatas[row][col]+"\t");
            }
            System.out.println();
        }

    }

    static 
    {
        System.out.println(" Welcome to Jagged Array");
    }
}
