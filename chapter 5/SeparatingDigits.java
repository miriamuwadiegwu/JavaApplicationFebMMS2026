import java.util.Scanner;

public class SeparatingDigits{
    public static int quotient(int a, int b){
        return a / b;
    }

    public static int remainder(int a, int b){
        return a % b;
    }

    public static void displayDigits(int number){
        int divisor = 1;
        while (divisor * 10 <= number)
            divisor *= 10;
        while (divisor >= 1) {
            System.out.print(quotient(number, divisor) + "  ");
            number = remainder(number, divisor);
            divisor = quotient(divisor, 10);
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 99999: ");
        displayDigits(input.nextInt());
    }
}
