import java.util.Scanner;

public class TemperatureConversions{
    public static int celsius(int fahrenheit) {
        return (int) (5.0 / 9.0 * (fahrenheit - 32));
    }

    public static int fahrenheit(int celsius){
        return (int) (9.0 / 5.0 * celsius + 32);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("1 = Fahrenheit to Celsius, 2 = Celsius to Fahrenheit: ");
        int choice = input.nextInt();
        System.out.print("Enter temperature: ");
        int temp = input.nextInt();
        if (choice == 1)
            System.out.println(temp + "F = " + celsius(temp) + "C");
        else
            System.out.println(temp + "C = " + fahrenheit(temp) + "F");
    }
}
