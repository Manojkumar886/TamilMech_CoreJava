package fundamentaljava.Polymorphism;

import java.util.Arrays;

public class Methodride1 
{
    public void ArrayList(int arr[])
    {
        System.out.println(" method ride 1 : for loop printed");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public void ArrayUpdate(int arr[])
    {
        int pos=2;
        int newvalue=900;
        arr[pos]=newvalue;
        System.out.println(" your second position value is updated successfully");
    }
    
}
