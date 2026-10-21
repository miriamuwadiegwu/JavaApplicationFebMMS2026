import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        System.out.print("Enter number: ");
        int number = input.nextInt();
        int largest = number;

        while (counter < 10) {
            System.out.print("Enter number: ");
            number = input.nextInt();

            if (number > largest)
                largest = number;

            counter++;
        }

        System.out.println("Largest is: " + largest);
    }
}
