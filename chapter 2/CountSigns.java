import java.util.Scanner;

public class CountSigns {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int negative = 0, positive = 0, zero = 0;

      System.out.print("Enter five integers: ");
      int n1 = input.nextInt();
      int n2 = input.nextInt();
      int n3 = input.nextInt();
      int n4 = input.nextInt();
      int n5 = input.nextInt();

      if (n1 < 0) negative = negative + 1;
      if (n1 > 0) positive = positive + 1;
      if (n1 == 0) zero = zero + 1;

      if (n2 < 0) negative = negative + 1;
      if (n2 > 0) positive = positive + 1;
      if (n2 == 0) zero = zero + 1;

      if (n3 < 0) negative = negative + 1;
      if (n3 > 0) positive = positive + 1;
      if (n3 == 0) zero = zero + 1;

      if (n4 < 0) negative = negative + 1;
      if (n4 > 0) positive = positive + 1;
      if (n4 == 0) zero = zero + 1;

      if (n5 < 0) negative = negative + 1;
      if (n5 > 0) positive = positive + 1;
      if (n5 == 0) zero = zero + 1;

      System.out.printf("Negative: %d%n", negative);
      System.out.printf("Positive: %d%n", positive);
      System.out.printf("Zeros: %d%n", zero);
   }
}
