package fundamentaljava.Polymorphism;

import java.util.Arrays;

public class Methodride2  extends Methodride1
{
    public void ArrayList(int arr[])
    {
        System.out.println(" method ride 1 : to string  method printed");
        System.out.println(Arrays.toString(arr));
    }

    public void ArrayUpdate(int arr[])
    {
        int pos=1;
        int newvalue=1100;
        arr[pos]=newvalue;
        System.out.println(" your second position value is updated successfully");
    }
}
