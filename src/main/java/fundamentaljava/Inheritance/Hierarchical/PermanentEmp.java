package fundamentaljava.Inheritance.Hierarchical;

public class PermanentEmp  extends Management
{

    public void FulltimeEMP()
    {
        double hike=0.50;

        Salary=Salary+(Salary*hike);  // 10000+(5000) =15000

        System.out.println(" Full time Employee salary is "+Salary);

    }
    
}
