import java.util.Scanner;

public class LargestSmallest {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter five integers: ");
      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();
      int d = input.nextInt();
      int e = input.nextInt();

      int largest = a;
      if (b > largest) largest = b;
      if (c > largest) largest = c;
	        if (d > largest) largest = d;
      if (e > largest) largest = e;

      int smallest = a;
      if (b < smallest) smallest = b;
      if (c < smallest) smallest = c;
      if (d < smallest) smallest = d;
      if (e < smallest) smallest = e;

      System.out.printf("Largest is %d%n", largest);
      System.out.printf("Smallest is %d%n", smallest);
   }
}

