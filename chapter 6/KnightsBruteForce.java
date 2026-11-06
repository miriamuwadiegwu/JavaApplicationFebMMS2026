import java.util.Random;

public class KnightsBruteForce {
    static final int[] H = {2, 1, -1, -2, -2, -1, 1, 2};
    static final int[] V = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[][] board;
    static Random rand = new Random();

    static boolean ok(int r, int c) {
        return r >= 0 && r < 8 && c >= 0 && c < 8 && board[r][c] == 0;
    }

    static int randomTour() {
        board = new int[8][8];
        int r = rand.nextInt(8), c = rand.nextInt(8);
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
        return count;
    }

    static void printBoard() {
        for (int[] row : board) {
            for (int v : row) System.out.printf("%3d", v);
            System.out.println();
        }
    }

    static void printTally(int[] tally) {
        System.out.printf("%-10s%s%n", "Length", "Tours");
        for (int i = 1; i <= 64; i++)
            if (tally[i] > 0) System.out.printf("%-10d%d%n", i, tally[i]);
    }

    public static void main(String[] args) {
        // a) one tour
        System.out.println("a) Knight made " + randomTour() + " moves");
        printBoard();

        // b) 1,000 tours
        int[] tally = new int[65];
        int best = 0;
        for (int i = 0; i < 1000; i++) {
            int len = randomTour();
            tally[len]++;
            best = Math.max(best, len);
        }
        System.out.println("b) Best result: " + best);
        printTally(tally);

        // c) run until a full tour (may take a very long time)
        tally = new int[65];
        long tours = 0, start = System.currentTimeMillis();
        int len;
        do {
            len = randomTour();
            tally[len]++;
            tours++;
        } while (len < 64);
        System.out.println("c) Full tour after " + tours + " tours, "
                + (System.currentTimeMillis() - start) / 1000.0 + " seconds");
        printTally(tally);
    }
}