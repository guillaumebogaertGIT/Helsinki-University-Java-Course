
public class YourFirstAccount {

    public static void main(String[] args) {
        Account  guillaumesAccount = new Account ("Guillaume's account" , 100.0);
       
        System.out.println("Initial state: ");
        System.out.println(guillaumesAccount);
        

        guillaumesAccount.deposit(20);
        System.out.println("Balance account one: " + guillaumesAccount);
        

        // Do not touch the code in Account.java
        // Write your program here
    }
}
