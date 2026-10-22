import java.util.Scanner;

public class MethodOverLoading{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println("CALCULATE PERIMETER OF A SHAPE");
		System.out.println("======================\n");
		System.out.println("Enter 1. Circle");
		System.out.println("Enter 2. Square");
		System.out.println("Enter 3. Rectangle");
		System.out.println("======================");
		System.out.println("Enter your chioce: ");
		int choice = scan.nextInt();
		
		switch(choice){
			case 1:
			       System.out.print("Enter radius");
				   double radius = scan.nextDouble();
				   
				   System.out.printf("The circumference of the circle is %.2f%n",shape(radius));
			break;
			
			case 2:
			       System.out.print("Enter length of the square");
				   int lenght = scan.nextInt();
				   
				   System.out.printf("The perimeter of square is %d%n",shape(lenght));
			break;
			
			case 3:
			       System.out.print("Enter length of the rectangle");
				   int lenghtOfRect = scan.nextInt();
				   
				   System.out.print("Enter breath of the rectangle");
				   int breathOfRect = scan.nextInt();
				   
				   System.out.printf("The perimeter of rectangle is %d%n",shape(lenghtOfRect,breathOfRect));
			break;
			
			default:
			System.out.println("Exiting program............., Good Bye");
		}
	}
	public static double shape(double r){
		double perimeter = 2*Math.PI*r;
		
		return perimeter;
	}
	public static int shape(int l){
		int perimeter = 4*l;
		
		return perimeter;
	}
	public static int shape(int l, int b){
		int perimeter = 2*(l+b);
		
		return perimeter;
	}
}
	