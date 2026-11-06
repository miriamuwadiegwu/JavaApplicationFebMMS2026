public class KnightsTour {
    static final int[] H = {2, 1, -1, -2, -2, -1, 1, 2};
    static final int[] V = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[][] board;

    static boolean ok(int r, int c) {
        return r >= 0 && r < 8 && c >= 0 && c < 8 && board[r][c] == 0;
    }

    static int access(int r, int c) {
        int n = 0;
        for (int m = 0; m < 8; m++)
            if (ok(r + V[m], c + H[m])) n++;
        return n;
    }

    // mode 0 = first valid move (6.21b)
    // mode 1 = accessibility heuristic (6.21c)
    // mode 2 = accessibility + look-ahead on ties (6.21d)
    static int tour(int r, int c, int mode) {
        board = new int[8][8];
        int count = 1;
        board[r][c] = 1;
        while (true) {
            int best = -1, bestScore = Integer.MAX_VALUE, bestLook = Integer.MAX_VALUE;
            for (int m = 0; m < 8; m++) {
                int nr = r + V[m], nc = c + H[m];
                if (!ok(nr, nc)) continue;
                if (mode == 0) { best = m; break; }

                int score = access(nr, nc);
                int look = Integer.MAX_VALUE;
                if (mode == 2) {
                    board[nr][nc] = -1; // temporarily occupied
                    for (int k = 0; k < 8; k++) {
                        int rr = nr + V[k], cc = nc + H[k];
                        if (ok(rr, cc)) look = Math.min(look, access(rr, cc));
                    }
                    board[nr][nc] = 0;
                }
                if (score < bestScore || (score == bestScore && look < bestLook)) {
                    best = m;
                    bestScore = score;
                    bestLook = look;
                }
            }
            if (best == -1) break;
            r += V[best];
            c += H[best];
            board[r][c] = ++count;
        }
        return count;
    }

    static void print() {
        for (int[] row : board) {
            for (int v : row) System.out.printf("%3d", v);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("6.21b - first valid move: " + tour(0, 0, 0) + " moves");
        print();

        System.out.println("6.21c - accessibility, from corner: " + tour(0, 0, 1) + " moves");
        print();

        for (int mode = 1; mode <= 2; mode++) {
            int full = 0;
            for (int r = 0; r < 8; r++)
                for (int c = 0; c < 8; c++)
                    if (tour(r, c, mode) == 64) full++;
            System.out.println("Mode " + mode + ": " + full + " full tours out of 64 starts");
        }
    }
}