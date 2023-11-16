package fundamentaljava;


public class DemoMethodsUsage 
{
    int serialno=4;//global variable
    // w/o returntype w/o arguments

    public void Student1()
    {
        System.out.println(" without ReturnType and without Arguments");
        char initial='m';
        int initialtono=initial;
        System.out.println(" my initial "+initial+"\n my initial in Asci no"+initialtono);
    }
    // withour returntype with Arguments

    public void Student2(String stud_name,int stud_age)
    {
        System.out.println(" My Name is : "+stud_name);
        System.out.println(" my age is : "+stud_age );
        
        System.out.println(" my serial no "+serialno);//accessed in global variable
    
    }


    // with returntype w/o parameters
    public float DogDetails()
    {
        float dog_weight=12.5f;//local variable

        return dog_weight;
    }

    // with returntype with arguments
    public String ActorDetails(String actor_name,char actor_bloodgroup)
    {
        System.out.println(" my favoriate actor name is :"+actor_name);
        System.out.println(actor_name+" he blood_group is "+actor_bloodgroup);
        return actor_name;
    }
    public static void main(String[] args) 
    {
        DemoMethodsUsage usage=new DemoMethodsUsage();
        
        usage.Student1();

        int age=22;
        usage.Student2("Manojkumar",age);

        int gettingdogweight=(int)usage.DogDetails();//narrowing
        System.out.println(" my dog weight is :"+gettingdogweight);
        
        String heroname=usage.ActorDetails("VIJAY", 'B');
        System.out.println(" my hero name is :"+heroname);
        
        System.out.println(" my global in main :"+usage.serialno);//accessed global with using object
    }
    
}
