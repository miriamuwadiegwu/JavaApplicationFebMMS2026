public class CountEvenAndOdd{
	public static void main (String[] args){
		addition(2,11,13,8,6,4,9,17,3,10);//83
		addition(3,16,9,5,8);//41
	}
	public static void addition(int...numbers){
		int sum = 0;
	    for(int num : numbers){
			sum += num;
		}
		System.out.println(sum);
	}
}
