package fundamentaljava.Inheritance.Hierarchical;

public class Connection
{
    public static void main(String[] args) 
    {
        PermanentEmp pm=new PermanentEmp();
        
        pm.DisplaySalary();// management method
        pm.FulltimeEMP();//permanent method


        TeamLeader tl=new TeamLeader();
        tl.DisplaySalary(); // management method
        tl.TLSalary(); /// team leader salary
    }    
}
