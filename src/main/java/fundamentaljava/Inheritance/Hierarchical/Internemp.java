package fundamentaljava.Inheritance.Hierarchical;

public class Internemp extends Management
{
    public void intersalary()
    {
        double hike=0.25;
        Salary=Salary+(Salary*hike);// 10000+2500 =12500
       
        System.out.println(" Intern Employee Salary is :"+Salary);
    }
}
