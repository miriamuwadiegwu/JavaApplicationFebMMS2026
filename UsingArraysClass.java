import java.util.Arrays;

public class UsingArraysClass{
	public static void main (String[] args){
		int[] numbers = {5,19,25,6,3,1,30,7,50,61};
		
		int[] a = {3,4,8,9,5};
		int[] b = {3,4,8,9,5};
		
		
		Arrays.sort(numbers);
		System.out.println("---------sorting arrays-------");
		
		for(int num : numbers){
			System.out.println(num);
		}
		System.out.println("------------------------");
		int index = Arrays.binarySearch(numbers,25);
		System.out.println("Index of element 25 is "+ index); 
		
		boolean check = Arrays.equals(a,b);
		System.out.println("is a = {3,4,8,9,5} equals b = {3,4,8,7,5} " + check);
		
		
		int check2 = Arrays.compare(a,b);
		System.out.println("The answer is "+ check2);
		
		System.out.println("-----------Fill Array--------");
		int[] scores = new int[5];
		Arrays.fill(scores,90);
		
		for(int score : scores){
			System.out.println(score);
		}
		
		System.out.println("---------copy array------");
		int[] myCopyArray = Arrays.copyOf(numbers,5);
		
		for(int arr : myCopyArray){
			System.out.println(arr);
		}
		System.out.println(Arrays.toString(numbers));
		
	}
}