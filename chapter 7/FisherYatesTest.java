public class FisherYatesTest {
    public static void main(String[] args) {
        FisherYatesDeck deck = new FisherYatesDeck();
        deck.shuffle();
        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-22s", deck.dealCard());
            if (i % 4 == 0) System.out.println();
        }
    }
}