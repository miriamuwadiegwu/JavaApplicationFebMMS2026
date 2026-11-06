public class EightQueens {
    static boolean attacks(int r, int c, int r2, int c2) {
        return r == r2 || c == c2 || Math.abs(r - r2) == Math.abs(c - c2);
    }

    static int eliminated(boolean[][] free, int r, int c) {
        int n = 0;
        for (int r2 = 0; r2 < 8; r2++)
            for (int c2 = 0; c2 < 8; c2++)
                if (free[r2][c2] && attacks(r, c, r2, c2)) n++;
        return n;
    }

    public static void main(String[] args) {
        boolean[][] free = new boolean[8][8];
        boolean[][] queen = new boolean[8][8];
        for (boolean[] row : free) java.util.Arrays.fill(row, true);

        int placed = 0;
        while (placed < 8) {
            int bestR = -1, bestC = -1, bestE = Integer.MAX_VALUE;
            for (int r = 0; r < 8; r++)
                for (int c = 0; c < 8; c++)
                    if (free[r][c]) {
                        int e = eliminated(free, r, c);
                        if (e < bestE) { bestE = e; bestR = r; bestC = c; }
                    }
            if (bestR == -1) break; // no squares left
            queen[bestR][bestC] = true;
            placed++;
            for (int r = 0; r < 8; r++)
                for (int c = 0; c < 8; c++)
                    if (attacks(bestR, bestC, r, c)) free[r][c] = false;
        }

        System.out.println("Queens placed: " + placed);
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++)
                System.out.print(queen[r][c] ? "Q " : ". ");
            System.out.println();
        }
    }
}