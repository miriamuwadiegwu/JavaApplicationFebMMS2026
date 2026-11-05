import java.util.Scanner;

public class SquareAnyCharacter {
    public static void squareOfAsterisks(int side, char fillCharacter) {
        for (int row = 1; row <= side; row++) {
            for (int col = 1; col <= side; col++)
                System.out.print(fillCharacter);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side: ");
        int side = input.nextInt();
        System.out.print("Enter fill character: ");
        char fill = input.next().charAt(0);
        squareOfAsterisks(side, fill);
    }
}