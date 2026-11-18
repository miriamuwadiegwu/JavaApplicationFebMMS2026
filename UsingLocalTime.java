import java.time.LocalTime;


public class UsingLocalTime{
	public static void main(String[] args){
		LocalTime currentTime = LocalTime.now();
		LocalTime meetingTime = LocalTime.of(12,30,25);
		
		if(meetingTime.isBefore(currentTime)){
			System.out.println("Hahahahahahahah");
		}
		
		if(meetingTime.isAfter(currentTime)){
			System.out.println("Your are late");
		}
		
		
		System.out.printf("The meeting time is %s%n",currentTime);
		System.out.printf("The time for our meeting is %s%n",meetingTime);
	}
}
	
