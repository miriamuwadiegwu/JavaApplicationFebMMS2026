import java.time.LocalDateTime;

public class UsingLocalDateTime{
	public static void main(String[] args){
		LocalDateTime currentDateTime = LocalDateTime.now();
		
		
		System.out.printf("Today's date and time is %s%n",currentDateTime);
	}
}