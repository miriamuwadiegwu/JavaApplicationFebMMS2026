public class ClassWork2{
	public static void main(String[] ages){
		checkAge(26);
		checkAge(17);
		checkAge(18);
		checkAge(30);
		checkAge(15);
		
	}
	
	public static void checkAge(int age){
		if(age >= 18){
			System.out.println("You are an Adult");
		}
		else{
			System.out.println("You are still a minor");
		}
	}
}