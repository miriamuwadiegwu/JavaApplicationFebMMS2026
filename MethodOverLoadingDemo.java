public class MethodOverLoadingDemo{
	public static void main (String[] args){
		addition(18);//18
		addition(18,9,4);//31
		addition(18,7,3,2);//30
		addition(18,7);//25
		addition(18,15);//33
	}
	
	public static void addition(int a){
		int sum = a;
		System.out.println(sum);
	}
    public static void addition(int a,int b){
		int sum = a + b;
		System.out.println(sum);
	}
	public static void addition(int a,int b,int c){
		int sum = a + b + c;
		System.out.println(sum);
	}
	public static void addition(int a,int b,int c,int d){
		int sum = a + b + c + d;
		System.out.println(sum);
	}
}
	
	