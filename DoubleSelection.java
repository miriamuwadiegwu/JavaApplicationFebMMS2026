import java.util.Scanner;

public class DoubleSelection{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter FullName: ");
		String FullName = scan.nextLine();
		
		System.out.print("Enter UserName: ");
		String username = scan.nextLine();
		
		System.out.print("Enter Password: ");
		String password = scan.nextLine();
		
		if(username.equals("johnnydeep") && password.equals("12345")){
			System.out.println("Access Granted");
			System.out.println(FullName + " you are welcome");
		}
		else{
			System.out.println("Access Denied");
		}
		
		
	}
}