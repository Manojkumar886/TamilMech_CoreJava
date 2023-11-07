package fundamentaljava;

import java.util.Scanner;
// java-->util--->Scanner--->nextInt()
//java---->fundamentaljava--->Demovariable--->local()
public class DemoVariables
{
 

    public void Local()//user defined method
    {
        // DemoVariables demo1=new DemoVariables();
        // demo1.Local();
        Scanner scan=new Scanner(System.in);
        System.out.println("MY College Percentage ");
        float Percentage=scan.nextFloat();//Local Variable
        System.out.println("my college name");
        String college_name=scan.next();
        System.out.println("my percentage :"+Percentage);
        System.out.println("my college nmse:"+college_name);
        System.out.println("My Global Value is :"+Alpha);//accessed to global variable;
        System.out.println("my static variable using method :"+Initial);//accessed to static variable
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

       
        System.out.println("My Global value with using object: "+demo.Alpha );//Accessed global variable with using object 
        System.out.println("my static variable is initial :"+Initial);//easy to access static
    }  
    int Alpha=908; //global variable
    static char Initial='M';//static variable    
    
}
