import java.util.Scanner;

public class ParkingCharges{
    public static double calculateCharges(double hours) {
        double h = Math.ceil(hours);
        double charge = 2.00;
        if (h > 3) charge += 0.50 * (h - 3);
        return Math.min(charge, 10.00);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        System.out.println("Enter hours parked (-1 to stop):");
        double hours = input.nextDouble();
        while (hours >= 0) {
            double charge = calculateCharges(hours);
            total += charge;
            System.out.printf("Charge: $%.2f  Running total: $%.2f%n", charge, total);
            hours = input.nextDouble();
        }
        System.out.printf("Total receipts: $%.2f%n", total);
    }
}