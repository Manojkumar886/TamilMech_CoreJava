package fundamentaljava.Inheritance.SingleInheritanc;

public class Fruitsmain extends Fruits
{
    public void BananaTypes()
    {
        System.out.println(" welcome to banana method...!");
        // Banana(); // parent class method referenced by parent class
    }

    public void Apple()
    {
        String [] Apple_Types =new String[4];
        Apple_Types[0]="Rubens";
        Apple_Types[1]="Royal Gala";
        Apple_Types[2]="Kanzi";
        Apple_Types[3]="Junami®";
        for(int i=0;i<Apple_Types.length;i++)
        {
            System.out.println(Apple_Types[i]);
        }
    }

    public static void main(String[] args)
    {
        Fruitsmain fm=new Fruitsmain();
        fm.BananaTypes(); //current class method
        fm.Apple();//current class method
        fm.Banana();// other class method
        fm.Mango();//other class method


    }
}
