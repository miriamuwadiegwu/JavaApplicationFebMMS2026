public class EnumCard{
    private final Face face;
    private final Suit suit;

    public EnumCard(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    public Face getFace() { return face; }
    public Suit getSuit() { return suit; }

    @Override
    public String toString() { return face + " of " + suit; }
}