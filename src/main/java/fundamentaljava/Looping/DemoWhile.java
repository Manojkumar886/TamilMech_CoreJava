package fundamentaljava.Looping;
public class DemoWhile 
{

    public static void main(String[] args) 
    {

        // while syntex:

        // initialization;
        // while(condition)
        // {
        //     statment;
        //     increment/decrement
        // }


        int count=100;

        while(count<=10)
        {
            System.out.println("count no :"+count);
            count-=10;
        }
        
        // infinite
        // while (true) {
        //     System.out.println("Manoj");
        // }
    }
}