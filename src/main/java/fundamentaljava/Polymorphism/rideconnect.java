package fundamentaljava.Polymorphism;

public class rideconnect 
{
    public static void main(String[] args) 
    {
        int [] mydata={ 12,34,5,654,675,356,34,22,46,7};
        // Methodride1 ride1=new Methodride1();
        // ride1.ArrayList(mydata);
        // ride1.ArrayUpdate(mydata);

        // Methodride2 ride2=new Methodride2();
        // ride2.ArrayList(mydata);
        // ride2.ArrayUpdate(mydata);


        // upcasting- Upcasting is the typecasting of a child object to a parent object.
        Methodride1 ride=new Methodride2();    
        ride.ArrayList(mydata);
        ride.ArrayUpdate(mydata);   
        
        Methodride1 rides=new Methodride1();

        rides.ArrayList(mydata);
        rides.ArrayUpdate(mydata);


    }   
}
