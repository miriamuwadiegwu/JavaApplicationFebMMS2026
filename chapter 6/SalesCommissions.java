import java.util.Scanner;

public class SalesCommissions{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] counts = new int[9]; // index 0 = $200-299 ... index 8 = $1000+
        System.out.print("Number of salespeople: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Gross sales for salesperson " + i + ": ");
            double sales = in.nextDouble();
            int salary = (int) (200 + 0.09 * sales);
            int index = Math.min(salary / 100 - 2, 8);
            if (index >= 0) counts[index]++;
        }
        System.out.printf("%-15s%s%n", "Range", "Count");
        for (int i = 0; i < 8; i++)
            System.out.printf("$%d-%-10d%d%n", 200 + i * 100, 299 + i * 100, counts[i]);
        System.out.printf("%-15s%d%n", "$1,000 & over", counts[8]);
    }
}