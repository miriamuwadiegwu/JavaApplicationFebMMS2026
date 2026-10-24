import java.util.Scanner;
 
public class FairTax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] cats = {"Housing", "Food", "Clothing", "Transportation",
                         "Education", "Health care", "Vacations"};
        double total = 0;
        for (String c : cats) {
            System.out.print("Enter yearly spending on " + c + ": ");
            total += in.nextDouble();
        }
        System.out.printf("Total expenses: %.2f%n", total);
        System.out.printf("Estimated FairTax (23%%): %.2f%n", total * 0.23);
        System.out.printf("Estimated FairTax (30%% rate): %.2f%n", total * 0.30);
    }
}
