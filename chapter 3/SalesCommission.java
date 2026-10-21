import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalSales = 0;

        System.out.print("Enter item value (-1 to finish): ");
        double value = input.nextDouble();

        while (value != -1) {
            totalSales += value;
            System.out.print("Enter item value (-1 to finish): ");
            value = input.nextDouble();
        }

        double earnings = 200 + 0.09 * totalSales;
        System.out.printf("Total sales: $%.2f%n", totalSales);
        System.out.printf("Earnings: $%.2f%n", earnings);
    }
}
