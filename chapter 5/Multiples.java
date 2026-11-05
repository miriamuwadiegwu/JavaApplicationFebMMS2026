import java.util.Scanner;

public class Multiples{
    public static boolean isMultiple(int first, int second){
        return second % first == 0;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter pairs of integers (enter 0 as the first to stop):");
        int first = input.nextInt();
        while (first != 0) {
            int second = input.nextInt();
            if (isMultiple(first, second))
                System.out.println(second + " is a multiple of " + first);
            else
                System.out.println(second + " is not a multiple of " + first);
            first = input.nextInt();
        }
    }
}
