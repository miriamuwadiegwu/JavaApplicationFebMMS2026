public class EnumDeckTest {
    public static void main(String[] args) {
        EnumDeckOfCards deck = new EnumDeckOfCards();
        deck.shuffle();
        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-22s", deck.dealCard());
            if (i % 4 == 0) System.out.println();
        }
    }
}