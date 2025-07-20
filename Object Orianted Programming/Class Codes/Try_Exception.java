import java.util.Scanner;

class BalanceTooLowException extends Exception {
    public BalanceTooLowException(String message) {
        super(message);
    }
}

public class Try_Exception {
    public static void main(String[] args) {
        int balance = 5000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw:");
        int withdraw = sc.nextInt();

        try {
            if (balance - withdraw < 1000) {
                throw new BalanceTooLowException("Balance must be greater than 1000");
            } else {
                balance = balance - withdraw;
                System.out.println("Withdrawal successful. New balance: " + balance);
            }
        } catch (BalanceTooLowException e) {
            System.err.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
