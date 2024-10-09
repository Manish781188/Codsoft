
//<---------------------------------------ATM INTERFACE--------------------------------------->

import java.util.Scanner;
class codsoft_Task3{
 static int balance =0;
static void Withdraw(int withdrawAmount){
if(balance>withdrawAmount){
    balance-=withdrawAmount;
    System.out.println("Tatal amount :"+balance);
    }else{
        System.out.println("Insufficient amount");
    }
}
static void Deposit(int depositeAmount){
    balance +=depositeAmount; 
    System.out.println( "Total balance:"+balance);
}
static void CheckBalance(){
    System.out.println("Balance :"+balance);
}

    public static void main (String[] args){
   Scanner sc = new Scanner(System.in);

      
        System.out.println("Select the ATM menu");
        System.out.println("* * * * * * * * * * * * * * * ");
        System.out.println("*   WELL COME  SBI ATM !    *");
        System.out.println("*   1. Withdraw             *");
        System.out.println("*   2. Deposit              *");
        System.out.println("*   3. Check Balance        *");
        System.out.println("*   4. Exit                 *");
        System.out.println("* * * * * * * * * * * * * * * ");
        int choice  = sc.nextInt();
       
        
        switch(choice){
            case 1 :  {
                System.out.println(" Enter the amount you want to withdraw");
                 int withdraw = sc.nextInt();
                Withdraw(withdraw);
                break;
            }
            case 2:  {
                 System.out.println("Enter the amount you want to deposite");
                 int deposite = sc.nextInt();
                Deposit(deposite);
             break;

            }
            case 3:  {
                CheckBalance();
            break;
            }
            case 4: {
                break;
            }
             default:{
            System.out.println("Enter the valid key");
           }
        }
        
    }
}