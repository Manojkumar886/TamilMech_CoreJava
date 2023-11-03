package fundamentaljava;

import java.util.Scanner;
// java-->util--->Scanner--->nextInt()
//java---->fundamentaljava--->Demovariable--->local()
public class DemoVariables
{

    public void Local()//user defined method
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("MY College Percentage ");
        float Percentage=scan.nextFloat();//Local Variable
        System.out.println("my percentage :"+Percentage);
    }

    public static void main(String[] args) //main method
    {
        Scanner scan=new Scanner(System.in);//object

        System.out.println(" Tell us your10th Mark");
        int mark_10th=scan.nextInt();//Instance Variable

        String RegisterName; //Instance variable

        System.out.println("my 10th total mark is :"+mark_10th);

        DemoVariables demo=new DemoVariables();//Current class object
        demo.Local();//Activated your method

        System.out.println("Thank you");
    }   
    
}
