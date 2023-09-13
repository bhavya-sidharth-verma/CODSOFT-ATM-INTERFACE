public class Main {
    public static void main(String[] args){
        Account mainAccount = new Account(0);
        ATM atm = new ATM(mainAccount);
        atm.choose();
    }

}
