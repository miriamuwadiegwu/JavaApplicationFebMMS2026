public class VarAgrsDemo{
	public static void main(String[] args){
		addition();//0
		addition(3,2,6);//11
		addition(8,5,3,2,1);//19
		addition(8,6);//14
		addition(5,2,1,4,5,7,9,1);//34
		addition(9,0,2,1,5,4);//21
	}
	
	public static void addition(int...numbers){
		int sum = 0;
		for(int num : numbers){
			sum += num;
		}
		System.out.println(sum);
	}
}