package fundamentaljava.Arrays;

import java.util.Arrays;

public class ReverseAnArray 
{
    public static void main(String[] args) 
    {
        int [] mydata={ 12,34,5,654,675,356,34,22,46,7};
        System.out.println("Original Order :"+Arrays.toString(mydata));

        System.out.print (" Reverse Order : " );
        for(int i=mydata.length-1;i>=0;i--)
        {
            System.out.print(mydata[i]+" ");
        }
        
    }
    
}
