import java.util.Scanner;

public class Account {
    private double bal;

    public Account(double initialBal) {
        bal = initialBal;
    }
    public double fetchBal(){
        return  bal;
    }
    public void deposit(double amt){
        if(amt > 0){
            bal = bal + amt;
            System.out.println("Amount Deposited: "+ amt);

        } else {
            System.out.println("Amount you have entered  is invalid");
        }

    }
    public void withdraw(double amt) {
        if (amt > 0 && amt <= bal){
            bal = bal - amt;
            System.out.println("Amount Withdrawn: " + amt);
        } else if (amt > bal) {
            System.out.println("you have "+ bal +" Rupees in your account. you can not withdraw more than "+ bal);

        }else {
            System.out.println("Amount you have entered  is Invalid");
        }

    }

}

class ATM{
    private Account account;
    private Scanner scanner;

    public ATM(Account account){

        this.account=account;
        scanner = new Scanner(System.in);

    }
    public void options(){
        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
        System.out.print("▬▬▬▬▬▬  OPTIONS  ▬▬▬▬▬▬");
        System.out.println("\n");
        System.out.println("1. BALANCE INQUIRY");
        System.out.println("2. CASH DEPOSIT");
        System.out.println("3. CASH WITHDRAW");
        System.out.println("4. EXIT");
        System.out.print("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
        System.out.print("\n");
        System.out.println("Select the service you want.");
    }
    public void choose(){
        int ch;
        do {
            options();
           // System.out.println("Select the Service");
            ch = scanner.nextInt();
            switch (ch){
                case 1:
                    fetchBal();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    // exit
                    System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    System.out.println("THANK YOU FOR USING OUR SERVICES");
                    System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");
                    break;
                default:System.out.println("Invalid Choice");

            }
        }
        while (ch != 4);


    }
    private void fetchBal(){
        // balance display

        System.out.println("▬▬▬▬▬▬| BALANCE |▬▬▬▬▬▬");
        System.out.println("Available balance: " + "₹" +account.fetchBal());
        System.out.print("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
        System.out.println("\n\n");
    }
    private void deposit(){
        System.out.println("Enter the Amount you want to Deposit");
        double amt = scanner.nextDouble();
        account.deposit(amt);
    }
    private void withdraw(){
        System.out.println("Enter Amount to Withdrawn");
        double amt = scanner.nextDouble();
        account.withdraw(amt);
    }

}
