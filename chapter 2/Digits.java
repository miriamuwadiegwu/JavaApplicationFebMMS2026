import java.util.Scanner;

public class Digits {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter a five-digit number: ");
      int number = input.nextInt();

      int digit1 = number / 10000;
      number = number % 10000;
      int digit2 = number / 1000;
      number = number % 1000;
      int digit3 = number / 100;
      number = number % 100;
      int digit4 = number / 10;
      int digit5 = number % 10;

      System.out.printf("%d   %d   %d   %d   %d%n",
         digit1, digit2, digit3, digit4, digit5);
   }
}
