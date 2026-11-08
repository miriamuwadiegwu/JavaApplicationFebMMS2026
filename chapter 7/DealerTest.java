public class DealerTest{

    // Keeps pairs/trips; with no match keeps the 2 highest cards.
    // Returns how many cards were replaced (0 to 3).
    public static int dealerDraw(Card[] hand, DeckOfCards deck) {
        if (DeckOfCards.rank(hand) >= 4) return 0;

        int[] counts = new int[13];
        for (Card c : hand) counts[DeckOfCards.faceIndex(c)]++;

        boolean[] keep = new boolean[5];
        boolean anyMatch = false;
        for (int i = 0; i < 5; i++) {
            if (counts[DeckOfCards.faceIndex(hand[i])] >= 2) {
                keep[i] = true;
                anyMatch = true;
            }
        }
        if (!anyMatch) {
            for (int k = 0; k < 2; k++) {
                int best = -1;
                for (int i = 0; i < 5; i++)
                    if (!keep[i] && (best < 0 ||
                        DeckOfCards.value(hand[i]) > DeckOfCards.value(hand[best])))
                        best = i;
                keep[best] = true;
            }
        }

        int drawn = 0;
        for (int i = 0; i < 5; i++) {
            if (!keep[i]) {
                hand[i] = deck.dealCard();
                drawn++;
            }
        }
        return drawn;
    }

    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        Card[] dealer = deck.dealHand();

        System.out.println("Dealer's hand is dealt face down.");
        System.out.println("Dealer secretly evaluates: " + DeckOfCards.handName(dealer));

        int drawn = dealerDraw(dealer, deck);
        System.out.println("Dealer draws " + drawn + " card(s).\n");

        System.out.println("Dealer's final hand:");
        for (Card c : dealer) System.out.println("  " + c);
        System.out.println("  -> " + DeckOfCards.handName(dealer));
    }
}