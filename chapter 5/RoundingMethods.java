import java.util.Scanner;

public class RoundingMethods{
    public static double roundToInteger(double n)     { return Math.floor(n + 0.5); }
    public static double roundToTenths(double n)      { return Math.floor(n * 10 + 0.5) / 10; }
    public static double roundToHundredths(double n)  { return Math.floor(n * 100 + 0.5) / 100; }
    public static double roundToThousandths(double n) { return Math.floor(n * 1000 + 0.5) / 1000; }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int count = input.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Enter a number: ");
            double x = input.nextDouble();
            System.out.println("Original: " + x);
            System.out.println("Integer: " + roundToInteger(x));
            System.out.println("Tenth: " + roundToTenths(x));
            System.out.println("Hundredth: " + roundToHundredths(x));
            System.out.println("Thousandth: " + roundToThousandths(x));
        }
    }
}
