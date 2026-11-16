public class ClassWork4{
	public static void main(String[] args){
		int[][] numbers ={
			{5,9,3,6,2},
			{4,8,7,6,1},
			{8,9,3,1,0},
			{9,3,1,4,7}
		};
		System.out.println("------------------------");
		for(int row = 0; row < 4; row++){
			for(int col = 0; col < 5; col++){
				System.out.print(numbers[row][col]);
				
				if(col < numbers[row].length - 1){
					System.out.print(",");
				}	
				
			}
			System.out.println();
		}
		 System.out.println("------------------------"); 
	}	
}