import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter any Number: ");
        int n = scan.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}