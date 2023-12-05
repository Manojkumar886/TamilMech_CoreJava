package fundamentaljava.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Recreate 
{
    public static void main(String[] args)
    {
        int [] mydata={ 12,34,5,654,675,356,34,22,46,7};

        System.out.println(mydata);//address only showing

        System.out.println(Arrays.toString(mydata));

        String [] Fruitsname=new String[5];

        Scanner scan=new Scanner(System.in);
        for(int i=0;i<Fruitsname.length;i++)
        {
            System.out.println(i+" index of Fruit name please enter:");
            Fruitsname[i]=scan.nextLine();        
        }

        for(String fruit:Fruitsname)
        {
            System.out.println(fruit);
        }
        
    }    
}
