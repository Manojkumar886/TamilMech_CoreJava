package fundamentaljava.Inheritance.SingleInheritanc;

import java.util.Arrays;

public class Fruits 
{
    public void Mango()
    {
        String [] mangotypes={"irwin","ataulfo","Keitt","sensation","ice cream"};
        System.out.println("\n"+Arrays.toString(mangotypes));
    }

    public void Banana()
    {
        String [] bananatypes={ "Cavendish Banana",
            "Pisang Raja",
            "Red Banana",
            "Lady Finger Banana",
            "Blue Java Banana",
            "Plantain",
            "Manzano Banana",
            "Burro Banana"};


            for(String types : bananatypes)
            {
                System.out.print( types+"\t ");
            }
    }
}
