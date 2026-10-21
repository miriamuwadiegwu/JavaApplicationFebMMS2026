import java.util.Scanner;

public class TwoLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        System.out.print("Enter number: ");
        int number = input.nextInt();
        int largest = number;
        int secondLargest = Integer.MIN_VALUE;

        while (counter < 10) {
            System.out.print("Enter number: ");
            number = input.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }

            counter++;
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second largest: " + secondLargest);
    }
}
