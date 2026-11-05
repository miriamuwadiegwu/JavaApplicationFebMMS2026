import java.util.Scanner;

public class Hypotenuse{
    public static double hypotenuse(double side1, double side2){
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("Triangle " + i + " - enter side1 and side2: ");
            double s1 = input.nextDouble();
            double s2 = input.nextDouble();
            System.out.println("Hypotenuse = " + hypotenuse(s1, s2));
        }
    }
}
