package fundamentaljava;

import java.util.Scanner;

public class DemoScanner 
{
    public static void main(String[] args)
    {
       Scanner tamil=new Scanner(System.in);

    //    DemoScanner obj=new DemoScanner();//current class object
        // String fullname;
        // fullname="Tamilselvan";

        System.out.println("What is your name");
        String name=tamil.next();
        System.out.println("Enter your college passed year");
        int passedyear=tamil.nextInt();
        System.out.println("Enter your college Percentage");
        float percentage=tamil.nextFloat();


        System.out.println("MY Name is :"+name);
        System.out.println("My Passed Year:"+passedyear);
        System.out.println("my college Percentage :"+percentage);

    }
}