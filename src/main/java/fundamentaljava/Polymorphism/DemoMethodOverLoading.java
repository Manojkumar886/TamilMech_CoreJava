package fundamentaljava.Polymorphism;

// compile time polymorphism
public class DemoMethodOverLoading 
{
    public static void SQUARE()
    {
        System.out.println("Different datatype of Square Performance");
    }

    public static void SQUARE(int number)
    {
        int Square;
        Square=number*number; 
        System.out.println(" my square value is :"+Square);
    }

    public static void SQUARE(double numbers)
    {
        double square;
        square=numbers*numbers;
        System.out.println(" my double value square root is :"+square);
    }
    public static void main(String[] args) 
    {
        SQUARE();
        SQUARE(89.8);
        SQUARE(10);
    }
}
