package fundamentaljava.Constructor;

public class ParamerterConstructor 
{
    String Bank_Name;
    String Bank_Address;//global variable
    
    public ParamerterConstructor(String bankname ,String bankAddress)
    {
        Bank_Name=bankname;
        Bank_Address=bankAddress;
    }

    public static void main(String[] args) 
    {
        ParamerterConstructor params=new ParamerterConstructor("ICICI BANK","Boomanahalli");
        
        System.out.println(" My sister is working in "+params.Bank_Name);
        System.out.println(" my sister working place @ "+params.Bank_Address);
    }
}
