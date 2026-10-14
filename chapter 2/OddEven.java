import java.util.Scanner;

public class OddEven {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter an integer: ");
      int number = input.nextInt();

      if (number % 2 == 0)
         System.out.printf("%d is even%n", number);
      if (number % 2 != 0)
         System.out.printf("%d is odd%n", number);
   }
}
