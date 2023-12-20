package fundamentaljava.Constructor;

public class Defaultconstructor 
{
    String studentName;
    int StudentAge;

    public static void main(String[] args) 
    {
        Defaultconstructor default1=new Defaultconstructor(); //    Intialize Object 

        System.out.println(" My Name is :"+default1.studentName);
        System.out.println("My age is :"+default1.StudentAge);
    }
}
