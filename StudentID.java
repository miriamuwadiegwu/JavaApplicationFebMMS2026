import java.util.Random;

public class StudentID{
	public static void main(String[] args){
		Random rand = new Random();
		int number = 30000 + rand.nextInt(70000);
		String StudentID = "STU" + number;
		
		System.out.println("StudentID: " + StudentID);
		
	}
}