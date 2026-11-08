import java.security.SecureRandom;

public class FisherYatesDeck {
    private static final SecureRandom rnd = new SecureRandom();
    private EnumCard[] deck = new EnumCard[52];
    private int currentCard = 0;

    private final Face[] faces = Face.values();
    private final Suit[] suits = Suit.values();

    public FisherYatesDeck() {
        for (int i = 0; i < deck.length; i++)
            deck[i] = new EnumCard(faces[i % 13], suits[i / 13]);
    }

    // Fisher-Yates shuffle
    public void shuffle() {
        currentCard = 0;
        for (int i = deck.length - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);   // 0 <= j <= i
            EnumCard temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public EnumCard dealCard() {
        return currentCard < deck.length ? deck[currentCard++] : null;
    }
}