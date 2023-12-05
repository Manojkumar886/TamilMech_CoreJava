package fundamentaljava.Arrays;

import java.util.Arrays;

public class PassingAnArray 
{
    public static void passing(int data[])
    {
        data[3]=456;
        for(int i=0;i<data.length;i++)
        {
            if(data[i]==456)
            {
                System.out.println(" 456 number is founded @"+i);
            }
        }
    }

    public static void main(String[] args) 
    {
        int [] mydata={ 12,34,5,654,675,356,34,22,46,7};

        passing(mydata);

        System.out.println(Arrays.toString(mydata));
        
    }
}
