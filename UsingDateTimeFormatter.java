import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class UsingDateTimeFormatter{
	public static void main(String[] args){
		LocalDate partyDate = LocalDate.parse("2026-10-18");
		LocalTime partyTime = LocalTime.of(13,30,30);

		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd MMMM YYYY");
		DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("hh:mm:ss");
		
		System.out.println(partyDate.format(myFormat));
		System.out.println(partyTime.format(formatTime));
		
		
	}
}