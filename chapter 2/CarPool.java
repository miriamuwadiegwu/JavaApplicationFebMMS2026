import java.util.Scanner;

public class CarPool {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Total miles driven per day: ");
      int miles = input.nextInt();
      System.out.print("Cost per gallon of gasoline: ");
      double gasCost = input.nextDouble();
      System.out.print("Average miles per gallon: ");
      int mpg = input.nextInt();
      System.out.print("Parking fees per day: ");
      double parking = input.nextDouble();
      System.out.print("Tolls per day: ");
      double tolls = input.nextDouble();
      double dailyCost = (miles / (double) mpg) * gasCost + parking + tolls;

      System.out.printf("Your cost of driving per day is $%.2f%n", dailyCost);
   }
}

