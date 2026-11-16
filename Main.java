import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new
		Scanner(System.in);
		int[] numbers = new int[10];
		
		// 1. Accept 10 numbers from user and store in array
		for(int i =0; i < 10; i++){
			System.out.print("Enter number"+(i+1)+":");
			numbers[i]=input.nextInt();
		}
		
		// 2. Add the 3rd,5th and 10th number
		// Array index starts from 0, so:
		// 3rd= numbers[2],5th=numbers[4],10th=numbers[9]
		int sum= numbers[2]+numbers[4]+numbers[9];
		
		System.out.println("\n3rd number ="+numbers[2]);
		System.out.println("5th number="+numbers[4]);
		System.out.println("10th number="+numbers[9]);
		System.out.println("Sum="+sum);
		
		// Check if sum is even or odd
		if(sum%2==0){
			System.out.println(sum+"is an EVEN number");
		}
		else{
			System.out.println(sum+"is an ODD number");
		}
		input.close();
	}
}