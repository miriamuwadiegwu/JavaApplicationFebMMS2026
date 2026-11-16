public class ClassWork8{

    // Method to sum a multidimensional array
    public static int sumMultidimensionalArray(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int[][] numbers = {
            {5, 9, 3, 6, 2},
            {4, 8, 7, 6, 1},
            {8, 9, 3, 1, 0},
            {9, 3, 1, 4, 7}
        };

        int total = sumMultidimensionalArray(numbers);
        System.out.println("Sum of all elements: " + total);
    }
}