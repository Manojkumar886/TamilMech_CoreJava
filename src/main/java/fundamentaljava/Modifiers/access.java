package fundamentaljava.Modifiers;


// public - access everywhere in your project .(method ,variable,class)
// private - access within class only.(method ,variable,class)
// protected - access only method and variables.in the method and variables 
//              access only same class and same packages.suppose used outside package using extends and access to other methods

// Default - access same classes and same package.outside package cannot be accessed default methods and variables and class....
public class access 
{

    public void publicmodifier()
    {
        System.out.println(" first access modifier..!");
    }

     private void privateModifier()
     {
        System.out.println(" second access modifier..! with in access same class only");
     }

     protected void protectedModifier()
     {
        System.out.println(" third access modifier");
     }

      void DefaultModfier()
      {
        System.out.println(" fourth access modifier");
      }

    public static void main(String[] args) 
    {
        access a=new access();
        a.privateModifier();
        a.publicmodifier();
        a.protectedModifier();
        a.DefaultModfier();
    }
    
}
