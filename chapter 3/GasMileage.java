import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalMiles = 0;
        int totalGallons = 0;

        System.out.print("Enter miles driven (-1 to quit): ");
        int miles = input.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();

            totalMiles += miles;
            totalGallons += gallons;

            double tripMpg = (double) miles / gallons;
            double combinedMpg = (double) totalMiles / totalGallons;

            System.out.printf("MPG this trip: %.2f%n", tripMpg);
            System.out.printf("Total MPG so far: %.2f%n%n", combinedMpg);

            System.out.print("Enter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }
    }
}
