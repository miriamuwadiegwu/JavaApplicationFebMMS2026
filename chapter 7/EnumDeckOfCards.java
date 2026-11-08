import java.security.SecureRandom;

public class EnumDeckOfCards {
    private static final SecureRandom rnd = new SecureRandom();
    private EnumCard[] deck = new EnumCard[52];
    private int currentCard = 0;

    private final Face[] faces = Face.values();
    private final Suit[] suits = Suit.values();

    public EnumDeckOfCards() {
        for (int i = 0; i < deck.length; i++)
            deck[i] = new EnumCard(faces[i % 13], suits[i / 13]);
    }

    public void shuffle() {
        currentCard = 0;
        for (int i = 0; i < deck.length; i++) {
            int j = rnd.nextInt(52);
            EnumCard temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public EnumCard dealCard() {
        return currentCard < deck.length ? deck[currentCard++] : null;
    }
}