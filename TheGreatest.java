import java.util.Scanner;

public class TheGreatest{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input 1st number: ");
        int a = scan.nextInt();
        System.out.print("Input 2nd number: ");
        int b = scan.nextInt();
        System.out.print("Input 3rd number: ");
        int c = scan.nextInt();

        int greatest = a;
        if (b > greatest) greatest = b;
        if (c > greatest) greatest = c;

        System.out.println("The greatest: " + greatest);
    }
}