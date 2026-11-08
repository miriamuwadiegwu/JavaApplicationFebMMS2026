import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = in.nextLine();
        System.out.print("Enter last name: ");
        String last = in.nextLine();
        System.out.print("Enter birth month (1-12): ");
        int month = in.nextInt();
        System.out.print("Enter birth day: ");
        int day = in.nextInt();
        System.out.print("Enter birth year: ");
        int year = in.nextInt();

        HeartRates person = new HeartRates(first, last, month, day, year);

        System.out.printf("%nName: %s %s%n", person.getFirstName(), person.getLastName());
        System.out.printf("Date of birth: %d/%d/%d%n",
            person.getMonth(), person.getDay(), person.getYear());
        System.out.printf("Age: %d years%n", person.getAge());
        System.out.printf("Maximum heart rate: %d bpm%n", person.getMaximumHeartRate());
        System.out.printf("Target heart rate range: %.0f - %.0f bpm%n",
            person.getTargetHeartRateLow(), person.getTargetHeartRateHigh());
    }
}