package fundamentaljava.Stringclass;

public class DemoStringBuffer 
{
    public static void main(String[] args) 
    { 
        // 
        StringBuilder build=new StringBuilder("Tamilarasan");

        StringBuffer user1=new StringBuffer("Manoj");
        StringBuffer user2=new StringBuffer("Manojkumar");
        // mutable

        // append- one string to another string connection
        System.out.println(user1.append("kumar")); //Manojkumar

        System.out.println(user1); //Manojkumar
        System.out.println(user1.compareTo(user2));  //0

        // insert a values between object
        System.out.println(user2.insert(5, " ")); //Manoj kumar
        
        // replace
        System.out.println(user1.replace(5, 10, " JavaDeveloper"));  //manoj JavaDeveloper

        // reverse -reverse your values
        System.out.println(user2.reverse());//ramuk jonam
        // sub-string
        System.out.println(user1.substring(6, 19));//javaDeveloper
        // delete
        System.out.println(user2.delete(0, 5)); //jonam
        // 
        System.out.println(user2.reverse()); //manoj
        // 

        System.out.println(user1); //Manoj JavaDeveloper
        System.out.println(user2);//manoj
    }    
}
