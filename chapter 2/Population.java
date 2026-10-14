import java.util.Scanner;

public class Population {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter current world population: ");
      long population = input.nextLong();
      System.out.print("Enter annual growth rate (percent): ");
      double rate = input.nextDouble();

      long year1 = (long) (population + population * rate / 100);
      long year2 = (long)(year1 + year1 * rate / 100);
      long year3 = (long)(year2 + year2 * rate / 100);
      long year4 = (long)(year3 + year3 * rate / 100);
      long year5 = (long)(year4 + year4 * rate / 100);

      System.out.printf("After 1 year:  %d%n", year1);
      System.out.printf("After 2 years: %d%n", year2);
      System.out.printf("After 3 years: %d%n", year3);
      System.out.printf("After 4 years: %d%n", year4);
      System.out.printf("After 5 years: %d%n", year5);
   }
}
