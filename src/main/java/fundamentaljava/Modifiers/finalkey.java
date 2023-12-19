package fundamentaljava.Modifiers;

// final class - cannot be extends in other classes
// final method -cannot be override in other classess
// final variable - cannot be changed any values (constands)
final class finalkey 
{
    final void finalmethdo()
    {
        System.out.println(" cannot override");
    }
    static int a=6;
   static final int ab=6;
    public static void main(String[] args) {
        // ab=8; // final global variable cannot be changed
        a=10;// global variable can changed
    }

}
