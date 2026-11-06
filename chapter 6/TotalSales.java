import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] sales = new double[5][4]; // [product][salesperson]

        while (true) {
            System.out.print("Salesperson (1-4, 0 to finish): ");
            int person = in.nextInt();
            if (person == 0) break;
            System.out.print("Product (1-5): ");
            int product = in.nextInt();
            System.out.print("Total dollar value: ");
            double value = in.nextDouble();
            if (person < 1 || person > 4 || product < 1 || product > 5) {
                System.out.println("Invalid slip.");
                continue;
            }
            sales[product - 1][person - 1] += value;
        }

        double[] colTotals = new double[4];
        System.out.printf("%-10s%10s%10s%10s%10s%12s%n",
                "Product", "SP 1", "SP 2", "SP 3", "SP 4", "Total");
        for (int p = 0; p < 5; p++) {
            double rowTotal = 0;
            System.out.printf("%-10d", p + 1);
            for (int s = 0; s < 4; s++) {
                System.out.printf("%10.2f", sales[p][s]);
                rowTotal += sales[p][s];
                colTotals[s] += sales[p][s];
            }
            System.out.printf("%12.2f%n", rowTotal);
        }
        System.out.printf("%-10s", "Total");
        double grand = 0;
        for (double t : colTotals) {
            System.out.printf("%10.2f", t);
            grand += t;
        }
        System.out.printf("%12.2f%n", grand);
    }
}