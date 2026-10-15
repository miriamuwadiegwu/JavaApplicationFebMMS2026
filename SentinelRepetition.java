import java.util.Scanner;


public class SentinelRepetition{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while(true){
			System.out.print("Enter number: ");
			int num = scan.nextInt();
			
			if(num == -1){
				break;
			}
			else{
				sum += num;
			}
		}
		System.out.printf("The sum of all numbers is %d%n",sum);
	}
}