public class ContinueStatemnt{
	public static void main(String[] args){
		for(int i = 1; i <= 20; i++){
			if(i == 15){
				continue;
			}
			System.out.println(i);
		}
	}
}