import java.util.Scanner;
 
public class Smallest {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("How many values? ");
        int count = input.nextInt();
        System.out.print("Enter integer: ");
        int smallest = input.nextInt();
        for (int i = 2; i <= count; i++) {
            System.out.print("Enter integer: ");
            int n = input.nextInt();
            if (n < smallest)
                smallest = n;
        }
        System.out.println("Smallest is " + smallest);
    }
}
