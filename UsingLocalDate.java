import java.time.LocalDate;
import java.util.Scanner;


public class UsingLocalDate{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		LocalDate currentDate = LocalDate.now();
		LocalDate examDate = LocalDate.of(2026,11,18);
		
		System.out.print("Enter your date of Birth(YYYY-MM-DD): ");
		String birthDate = scan.nextLine();
		
		LocalDate userBirthDate = LocalDate.parse(birthDate);
		
		System.out.printf("Today's date is %s%n",currentDate);
		System.out.printf("My java exam is on %s%n",examDate);
		System.out.printf("Your date of birth is %s%n",userBirthDate);
	}
}