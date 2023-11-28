package fundamentaljava.ControlStructure;

import java.util.Scanner;

public class DemoSwitch 
{
    public static void main(String[] args) 
    {
        // switch (10) {
        //     case 1:
        //         System.out.println(" one");
        //         break;
        //     case 2:
        //         System.out.println("two");
        //         break;
        //     case 3:
        //         System.out.println("three");
        //         break;
        
        //     default:
        //     System.out.println("not my values");
        //         break;
        // }


        double balance=8000;
        String wish;
        Scanner scan=new Scanner(System.in);
        System.out.println(" which process you want\nwithdraw\ndeposit\nbalancecheck");
        wish=scan.nextLine();

        switch(wish)
        {
            case "withdraw" :case "debit":
                System.out.println(" Enter your amount withdraw");
                double withdraw=scan.nextDouble();
                if(balance>=withdraw)
                {
                    balance-=withdraw;
                    System.out.println(" withdraw successfully completed amount "+withdraw);
                }
                else
                {
                    System.out.println(" Insuffient balance...!");
                }
                System.out.println("current balance :"+balance);
                break;
            case "Deposit":case "credit":
                System.out.println("choose to deposit..\n");
                System.out.println(" enter you amount deposit");
                double deposit=scan.nextDouble();
                balance+=deposit;
                System.out.println(" your amount is deposited "+deposit);
                System.out.println("current balance :"+balance);
                break;
            case "balancecheck":
                System.out.println("current balance :"+balance);
                break;
            default : System.out.println(" insuffient ....!");

        }
        
        
    }
    
}
