package fundamentaljava.Encapsulation;

public class connect extends Bank
{
    public static void main(String[] args) 
    {

        Bank b1=new Bank();
        
        // System.out.println(b1.name);
        // System.out.println(b1.acc_name);

        b1.setAcc_name("Tamil");
        b1.setAcc_balance(89000);
        b1.setAcc_mobileno(97893636673l);
        b1.setAcc_place("Salem");
        b1.setAcc_no(7654589867868l);
        
        System.out.println(" account_holder name  :"+b1.getAcc_name());

        System.out.println("Account_number:"+b1.getAcc_balance());
        }
}
