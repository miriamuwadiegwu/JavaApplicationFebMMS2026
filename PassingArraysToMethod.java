public class PassingArraysToMethod{
	public static void main(String[] args){
		int[] myNumbers ={9,7,3,4,6,1,2,12,8,4};
		
		int result = sum(myNumbers);
		System.out.println("The result is " + result);
	}
	
	public static int sum(int[] numbers){
		int sum = 0;
		for(int i = 0; i < numbers.length; i++){
			sum += numbers[i];
		}
		return sum;
	}
}