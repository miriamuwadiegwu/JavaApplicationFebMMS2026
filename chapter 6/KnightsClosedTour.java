import java.util.Random;

public class KnightsClosedTour {
    static final int[] H = {2, 1, -1, -2, -2, -1, 1, 2};
    static final int[] V = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[][] board;
    static Random rand = new Random();
    static int startR, startC, endR, endC;

    static boolean ok(int r, int c) {
        return r >= 0 && r < 8 && c >= 0 && c < 8 && board[r][c] == 0;
    }

    static int randomTour() {
        board = new int[8][8];
        int r = rand.nextInt(8), c = rand.nextInt(8);
        startR = r;
        startC = c;
        int count = 1;
        board[r][c] = 1;
        while (true) {
            int[] valid = new int[8];
            int n = 0;
            for (int m = 0; m < 8; m++)
                if (ok(r + V[m], c + H[m])) valid[n++] = m;
            if (n == 0) break;
            int m = valid[rand.nextInt(n)];
            r += V[m];
            c += H[m];
            board[r][c] = ++count;
        }
        endR = r;
        endC = c;
        return count;
    }

    // A closed tour: the 64th move is one knight move from the start square
    static boolean isClosedTour() {
        for (int m = 0; m < 8; m++)
            if (endR + V[m] == startR && endC + H[m] == startC)
                return true;
        return false;
    }

    public static void main(String[] args) {
        int len;
        do {
            len = randomTour();
        } while (len < 64); // may take a very long time
        System.out.println("Full tour found.");
        System.out.println("Closed tour: " + isClosedTour());
    }
}