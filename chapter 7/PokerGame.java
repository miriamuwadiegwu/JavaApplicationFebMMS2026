import java.util.Scanner;

public class PokerGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many games do you want to play? ");
        int games = Integer.parseInt(in.nextLine().trim());

        int playerWins = 0, dealerWins = 0, ties = 0;

        for (int g = 1; g <= games; g++) {
            DeckOfCards deck = new DeckOfCards();
            deck.shuffle();
            Card[] player = deck.dealHand();
            Card[] dealer = deck.dealHand();

            System.out.println("\n=== Game " + g + " ===");
            System.out.println("Your hand:");
            for (int i = 0; i < 5; i++)
                System.out.println("  " + (i + 1) + ") " + player[i]);
            System.out.println("  -> " + DeckOfCards.handName(player));

            System.out.print("Positions to replace (e.g. 1 3 5), or Enter to keep all: ");
            String line = in.nextLine().trim();
            if (!line.isEmpty()) {
                boolean[] replaced = new boolean[5];
                for (String t : line.split("\\s+")) {
                    int pos = Integer.parseInt(t) - 1;
                    if (pos >= 0 && pos < 5 && !replaced[pos]) {
                        player[pos] = deck.dealCard();
                        replaced[pos] = true;
                    }
                }
            }

            DealerTest.dealerDraw(dealer, deck);

            System.out.println("\nYour final hand: " + DeckOfCards.handName(player));
            System.out.println("Dealer's hand:   " + DeckOfCards.handName(dealer));

            int ps = DeckOfCards.score(player), ds = DeckOfCards.score(dealer);
            if (ps > ds)      { playerWins++; System.out.println("You win!"); }
            else if (ds > ps) { dealerWins++; System.out.println("Dealer wins."); }
            else              { ties++;       System.out.println("Tie."); }
        }

        System.out.println("\n=== Results after " + games + " games ===");
        System.out.println("You: " + playerWins + "  Dealer: " + dealerWins + "  Ties: " + ties);
    }
}