import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four-digit integer: ");
        int number = input.nextInt();

        int d1 = number / 1000;
        int d2 = (number / 100) % 10;
        int d3 = (number / 10) % 10;
        int d4 = number % 10;

        d1 = (d1 + 7) % 10;
        d2 = (d2 + 7) % 10;
        d3 = (d3 + 7) % 10;
        d4 = (d4 + 7) % 10;

        // swap 1st with 3rd, 2nd with 4th
        int temp = d1; d1 = d3; d3 = temp;
        temp = d2; d2 = d4; d4 = temp;

        System.out.println("Encrypted: " + d1 + d2 + d3 + d4);
    }
}
