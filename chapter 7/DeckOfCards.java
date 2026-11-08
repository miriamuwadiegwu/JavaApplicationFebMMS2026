import java.security.SecureRandom;
import java.util.Arrays;

public class DeckOfCards{
    public static final String[] FACES = {"Ace", "Deuce", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final SecureRandom rnd = new SecureRandom();

    private Card[] deck = new Card[52];
    private int currentCard = 0;

    public DeckOfCards() {
        for (int i = 0; i < deck.length; i++)
            deck[i] = new Card(FACES[i % 13], SUITS[i / 13]);
    }

    public void shuffle() {
        currentCard = 0;
        for (int i = 0; i < deck.length; i++) {
            int j = rnd.nextInt(52);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public Card dealCard() {
        return currentCard < deck.length ? deck[currentCard++] : null;
    }

    public Card[] dealHand() {
        Card[] hand = new Card[5];
        for (int i = 0; i < 5; i++) hand[i] = dealCard();
        return hand;
    }

    public static int faceIndex(Card c) {
        return Arrays.asList(FACES).indexOf(c.getFace());
    }

    // Ace counts high (13)
    public static int value(Card c) {
        int i = faceIndex(c);
        return i == 0 ? 13 : i;
    }

    private static int[] faceCounts(Card[] hand) {
        int[] counts = new int[13];
        for (Card c : hand) counts[faceIndex(c)]++;
        return counts;
    }

    private static int countOf(Card[] hand, int k) {
        int total = 0;
        for (int n : faceCounts(hand)) if (n == k) total++;
        return total;
    }

    public static boolean hasPair(Card[] hand)         { return countOf(hand, 2) >= 1; }
    public static boolean hasTwoPairs(Card[] hand)     { return countOf(hand, 2) == 2; }
    public static boolean hasThreeOfAKind(Card[] hand) { return countOf(hand, 3) >= 1; }
    public static boolean hasFourOfAKind(Card[] hand)  { return countOf(hand, 4) >= 1; }
    public static boolean hasFullHouse(Card[] hand)    { return countOf(hand, 3) == 1 && countOf(hand, 2) == 1; }

    public static boolean hasFlush(Card[] hand) {
        for (Card c : hand)
            if (!c.getSuit().equals(hand[0].getSuit())) return false;
        return true;
    }

    public static boolean hasStraight(Card[] hand) {
        for (int n : faceCounts(hand)) if (n > 1) return false;
        int[] idx = new int[5];
        for (int i = 0; i < 5; i++) idx[i] = faceIndex(hand[i]);
        Arrays.sort(idx);
        if (idx[4] - idx[0] == 4) return true;
        return idx[0] == 0 && idx[1] == 9 && idx[2] == 10
            && idx[3] == 11 && idx[4] == 12;
    }

    public static int rank(Card[] hand) {
        boolean flush = hasFlush(hand), straight = hasStraight(hand);
        if (flush && straight)     return 8;
        if (hasFourOfAKind(hand))  return 7;
        if (hasFullHouse(hand))    return 6;
        if (flush)                 return 5;
        if (straight)              return 4;
        if (hasThreeOfAKind(hand)) return 3;
        if (hasTwoPairs(hand))     return 2;
        if (hasPair(hand))         return 1;
        return 0;
    }

    public static String handName(Card[] hand) {
        String[] names = {"High card", "Pair", "Two pairs", "Three of a kind",
            "Straight", "Flush", "Full house", "Four of a kind", "Straight flush"};
        return names[rank(hand)];
    }

    public static int score(Card[] hand) {
        int high = 0;
        for (Card c : hand) high = Math.max(high, value(c));
        return rank(hand) * 100 + high;
    }
}