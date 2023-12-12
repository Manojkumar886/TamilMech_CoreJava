package fundamentaljava.Arrays;

import java.util.Arrays;

public class JaggedtoSingle 
{
   

    public static void jaggedtosingle(int [][] datas)
    {
        int [] jagtosin=new int[11];

        int index=0;
        // jagged to single changing performance
        for(int row=0;row<datas.length;row++)
        {
            for(int col=0;col<datas[row].length;col++)
            {   
              jagtosin[index]=datas[row][col];
              index++;
            }
        }

        //print single-d array
        System.out.println(Arrays.toString(jagtosin));


    }
    

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


        jaggedtosingle(mydatas);
    }
}
