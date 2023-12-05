package fundamentaljava.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UpdatingAnArray
{
    public static void main(String[] args)
    {
        String [] fruitname={"Apple","Banana","Mango","Orange","Watermelon","Gooseberry"};

        System.out.println(" before updating my fruits list :\n"+Arrays.toString(fruitname));
        
        // fruitname[3]="Lemon";
        Scanner scan=new Scanner(System.in);
        System.out.println(" which value of index of fruit name will update :");
        int pos=scan.nextInt();
        System.out.println(" you are choose to "+pos+"index ,please enter your new fruit name");
        String newfruit=scan.next();

        fruitname[pos]=newfruit;  //update a array

          System.out.println(" After updating my fruits list :\n"+Arrays.toString(fruitname));
 
    }
}
