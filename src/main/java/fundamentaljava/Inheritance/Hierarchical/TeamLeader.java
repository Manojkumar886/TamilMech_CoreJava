package fundamentaljava.Inheritance.Hierarchical;

public class TeamLeader extends Management 
{
    
    public void TLSalary()
    {
        double Hike=1.0;;
        Salary=Salary+(Salary*Hike);//10000+10000=20000
        System.out.println("My Company Team Leader Salary is  :"+Salary);

    }
}
