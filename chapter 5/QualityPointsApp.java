import java.util.Scanner;

public class QualityPointsApp{
    public static int qualityPoints(int average) {
        if (average >= 90) return 4;
        else if (average >= 80) return 3;
        else if (average >= 70) return 2;
        else if (average >= 60) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student's average: ");
        System.out.println("Quality points: " + qualityPoints(input.nextInt()));
    }
}