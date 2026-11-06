import java.util.Scanner;

public class DuplicateElimination{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] unique = new int[5];
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int num;
            do {
                System.out.print("Enter number (10-100): ");
                num = in.nextInt();
            } while (num < 10 || num > 100);

            boolean duplicate = false;
            for (int j = 0; j < count; j++)
                if (unique[j] == num) duplicate = true;

            if (!duplicate) unique[count++] = num;

            System.out.print("Unique values: ");
            for (int j = 0; j < count; j++)
                System.out.print(unique[j] + " ");
            System.out.println();
        }
    }
}