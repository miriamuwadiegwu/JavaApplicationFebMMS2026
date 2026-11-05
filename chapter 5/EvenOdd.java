import java.util.Scanner;

public class EvenOdd{
    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (0 to stop):");
        int n = input.nextInt();
        while (n != 0) {
            System.out.println(n + (isEven(n) ? " is even" : " is odd"));
            n = input.nextInt();
        }
    }
}
