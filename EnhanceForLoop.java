public class EnhanceForLoop{
	public static void main(String[] args){
		String[] names = {"Jack","Peter","Joel","Lucky","Andy"};
		int[] marks ={70,90,57,88,99};
		
		System.out.println("Student Report");
		System.out.printf("%-15s  %-15%n","Names","Marks");
		System.out.println("--------------");
		
		
		for(int i=0; i < 5; i++){
			System.out.printf("%-15s  %-15d%n",names[i],marks[i]);
		}
		
		
		
		System.out.println("--------------");
		
		for(String name : names){
			System.out.println(name);
		}
		
		
		System.out.println("--------------");
		
		for(int mark : marks){
			System.out.println(mark);
		}
	}
}