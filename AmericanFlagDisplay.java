public class AmericanFlagDisplay{
    public static void main(String[] args){
        for (int i = 1; i <= 9; i++){
            if (i <= 5){
                if (i % 2 == 1) System.out.print("* * * * * * ");
                else System.out.print(" * * * * * * ");
            }
            System.out.println("===============================");
        }
    }
}