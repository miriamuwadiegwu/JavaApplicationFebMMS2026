import java.util.Random;


public class UsingRandomClass{
	public static void main(String[] args){
		
		Random rand = new Random();
		
		int num1 = Math.abs(rand.nextInt());
		int num2 = rand.nextInt(100)+1;
		boolean answer =  rand.nextBoolean();
		char alpha = (char)(rand.nextInt(26)+ 'A');
		double num3 = rand.nextDouble();
		System.out.println("-----------------------------------");
		
		System.out.printf("The generated number is %d%n",num1);
		System.out.printf("The random number is %d%n",num2);
		System.out.printf("Do you love java ? %b%n",answer);
		System.out.printf("The generated alphabet is %c%n",alpha);
		System.out.printf("The generated number is %f%n",num3);
		System.out.println("-----------------------------------");
	}
}