public class Interest {
    public static void main(String[] args) {
        double principal = 1000.0;
        for (int rate = 5; rate <= 10; rate++) {
            System.out.printf("%nInterest rate: %d%%%n", rate);
            System.out.printf("%-6s%s%n", "Year", "Amount on deposit");
            for (int year = 1; year <= 10; year++) {
                double amount = principal * Math.pow(1.0 + rate / 100.0, year);
                System.out.printf("%-6d%,.2f%n", year, amount);
            }
        }
    }
}
