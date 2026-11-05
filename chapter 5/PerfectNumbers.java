public class PerfectNumbers{
    public static boolean isPerfect(int number){
        int sum = 0;
        for (int i = 1; i < number; i++)
            if (number % i == 0)
                sum += i;
        return sum == number;
    }

    public static void main(String[] args){
        for (int n = 1; n <= 1000; n++) {
            if (isPerfect(n)) {
                System.out.print(n + " = 1");
                for (int i = 2; i < n; i++)
                    if (n % i == 0)
                        System.out.print(" + " + i);
                System.out.println();
            }
        }
    }
}