public class TwoHandsTest{
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        Card[] hand1 = deck.dealHand();
        Card[] hand2 = deck.dealHand();

        System.out.println("Hand 1:");
        for (Card c : hand1) System.out.println("  " + c);
        System.out.println("  -> " + DeckOfCards.handName(hand1));

        System.out.println("Hand 2:");
        for (Card c : hand2) System.out.println("  " + c);
        System.out.println("  -> " + DeckOfCards.handName(hand2));

        int s1 = DeckOfCards.score(hand1), s2 = DeckOfCards.score(hand2);
        if (s1 > s2)      System.out.println("\nHand 1 is better.");
        else if (s2 > s1) System.out.println("\nHand 2 is better.");
        else              System.out.println("\nThe hands are equal.");
    }
}