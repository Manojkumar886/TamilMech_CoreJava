package fundamentaljava;

public class DemoTypecasting 
{
    public static void main(String[] args) 
    {
        // widining
        
        char myinitial='X';

        int convertinitial=myinitial;

        float inttofloat=convertinitial;


        System.out.println("my initial is :"+myinitial);

        System.out.println("convert to my initial -asci:"+convertinitial);
        
        System.out.println(" int to float :"+inttofloat);

        // Narrowing

        double myweight=68;

        char doubletochar=(char)myweight;

        System.out.println(" my weight :"+myweight);

        System.out.println("convert to char my weight:"+doubletochar);


    }
    
}
