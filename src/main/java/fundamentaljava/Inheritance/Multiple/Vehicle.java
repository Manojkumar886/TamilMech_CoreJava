package fundamentaljava.Inheritance.Multiple;

public class Vehicle implements Bike,Car,Cycle
{
    public void cartest(String carname)
    {
        System.out.println("Car testing!");
    }

    public void cycletest()
    {
        System.out.println(" Cycle Testing!");
    }   
    
    public void biketest()
    {
        System.out.println(" BikeTesting");
    }


    public static void main(String[] args) 
    {
        Vehicle v1=new Vehicle();
        v1.biketest();
        v1.cartest("Maruti");
        v1.cycletest();    
    }
}
