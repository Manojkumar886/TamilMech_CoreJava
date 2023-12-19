package fundamentaljava.Modifiers;

public class access1 
{
    public static void main(String[] args) 
    {
        access a=new access();// another class but same package
        a.publicmodifier(); // public method access everywhere
        // a.privateModifier();// this is private method access only same class    
        a.protectedModifier();
        a.DefaultModfier();
    }
    
}
