public class SumArgs {
    public static void main(String[] args) {
        double total = 0;
        for (String s : args)
            total += Double.parseDouble(s);
        System.out.println("Sum = " + total);
    }
}