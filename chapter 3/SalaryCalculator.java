import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int employee = 1;

        while (employee <= 3) {
            System.out.printf("Employee %d%n", employee);
            System.out.print("Enter hours worked: ");
            double hours = input.nextDouble();
            System.out.print("Enter hourly rate: ");
            double rate = input.nextDouble();

            double pay;
            if (hours <= 40)
                pay = hours * rate;
            else
                pay = 40 * rate + (hours - 40) * rate * 1.5;

            System.out.printf("Gross pay: $%.2f%n%n", pay);
            employee++;
        }
    }
}
