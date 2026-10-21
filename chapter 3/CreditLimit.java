import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number (-1 to quit): ");
        long account = input.nextLong();

        while (account != -1) {
            System.out.print("Enter balance at beginning of month: ");
            int balance = input.nextInt();
            System.out.print("Enter total charges: ");
            int charges = input.nextInt();
            System.out.print("Enter total credits: ");
            int credits = input.nextInt();
            System.out.print("Enter credit limit: ");
            int limit = input.nextInt();

            int newBalance = balance + charges - credits;
            System.out.println("Account: " + account);
            System.out.println("New balance: " + newBalance);

            if (newBalance > limit)
                System.out.println("Credit limit exceeded");

            System.out.println();
            System.out.print("Enter account number (-1 to quit): ");
            account = input.nextInt();
        }
    }
}
