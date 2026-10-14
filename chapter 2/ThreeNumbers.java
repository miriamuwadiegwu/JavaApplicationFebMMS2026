import java.util.Scanner;

public class ThreeNumbers {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Input three different integers: ");
      int x = input.nextInt();
      int y = input.nextInt();
      int z = input.nextInt();

      int sum = x + y + z;
      int product = x * y * z;
      int average = sum / 3;   // integer average

      int smallest = x;
      if (y < smallest) smallest = y;
      if (z < smallest) smallest = z;

      int largest = x;
      if (y > largest) largest = y;
      if (z > largest) largest = z;

      System.out.printf("Sum is %d%n", sum);
      System.out.printf("Average is %d%n", average);
      System.out.printf("Product is %d%n", product);
      System.out.printf("Smallest is %d%n", smallest);
      System.out.printf("Largest is %d%n", largest);
   }
}
