package fundamentaljava.Stringclass;

public class DemoStringMethods 
{
    public static void main(String[] args) 
    {
        //  Literal
        String user1="TamilSelvan";
        //  non -literal
        String user2=new String("Manojkumar");


        String user3=new String("manojkumar");

        System.out.println(user2);
        // Immutable
            // concat   - connect a two strings
            user2=user2.concat(" Madheswaran");
            // System.out.println(user2.concat("Madheswaran"));
            System.out.println(user2);

        // charAt - getting one character between string values.
        System.out.println(user2.charAt(5));

        // Equal or EqualIgnoreCase
        System.out.println(user1.equals("tamilselvan"));
        System.out.println(user1.equalsIgnoreCase("tamilselvan"));
        
        // compareto or comparetoIgnoreCase
         System.out.println(user1.compareTo("manojkumar")); //110 - 140 =-30
        System.out.println(user1.compareToIgnoreCase("tamilselvan")); //110-110  =0

        // startwith - which value is started ???

        System.out.println(user3.startsWith("man"));
        // endwoth 

        System.out.println(user1.endsWith("ven"));

        // replace - one sentence change the other word of one sentance.

        user1=user1.replace("Selvan", "larasan");
        System.out.println(user1);

        // subString-get a particular word in one sentance,spaces cannot be calculated by value
        System.out.println(user2.substring(0, 5));
        
        // contains-contains used in sequence of character (get a o/p in boolean)
        System.out.println(user1.contains("mil"));  //true

        // trim -waste fo spaces its removed
        String obj=new String("         welcome to everyone             ");
        System.out.println(obj);
        System.out.println(obj.trim());

        // Spilt

        String content="String is basicallly an object that represents sequnace of character values.";
        String spilting []=content.split(" ",12);

        for(String spi:spilting)
        {
            System.out.print(spi);
        }
        // String spilting []=content.split(" is",2);

        // for(String spi:spilting)
        // {
        //     System.out.print(spi);
        // }
    }    
}
