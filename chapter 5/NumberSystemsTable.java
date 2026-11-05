public class NumberSystemsTable{
    public static void main(String[] args) {
        System.out.printf("%-10s%-12s%-8s%-8s%n", "Decimal", "Binary", "Octal", "Hex");
        for (int i = 1; i <= 256; i++) {
            System.out.printf("%-10d%-12s%-8s%-8s%n", i,
                Integer.toBinaryString(i),
                Integer.toOctalString(i),
                Integer.toHexString(i).toUpperCase());
        }
    }
}
