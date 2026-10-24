public class Facebook {
    public static void main(String[] args) {
        double users = 1.0; // billions
        int month = 0;
        boolean reached15 = false;
        while (users < 2.0) {
            users *= 1.04;
            month++;
            if (!reached15 && users >= 1.5) {
                System.out.println("1.5 billion after " + month + " months");
                reached15 = true;
            }
        }
        System.out.println("2 billion after " + month + " months");
    }
}
