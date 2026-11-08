public class DeckOfCardsTest{
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        Card[] hand = deck.dealHand();

        System.out.println("Your hand:");
        for (Card c : hand) System.out.println(c);

        System.out.println("\nPair:            " + DeckOfCards.hasPair(hand));
        System.out.println("Two pairs:       " + DeckOfCards.hasTwoPairs(hand));
        System.out.println("Three of a kind: " + DeckOfCards.hasThreeOfAKind(hand));
        System.out.println("Four of a kind:  " + DeckOfCards.hasFourOfAKind(hand));
        System.out.println("Flush:           " + DeckOfCards.hasFlush(hand));
        System.out.println("Straight:        " + DeckOfCards.hasStraight(hand));
        System.out.println("Full house:      " + DeckOfCards.hasFullHouse(hand));
    }
}