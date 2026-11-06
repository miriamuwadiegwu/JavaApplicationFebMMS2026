import java.util.Random;

public class EightQueensBruteForce {
    static boolean attacks(int sq1, int sq2) {
        int r1 = sq1 / 8, c1 = sq1 % 8, r2 = sq2 / 8, c2 = sq2 % 8;
        return r1 == r2 || c1 == c2 || Math.abs(r1 - r2) == Math.abs(c1 - c2);
    }

    // a) random brute force
    static void randomSolve() {
        Random rand = new Random();
        int[] q = new int[8];
        long attempts = 0;
        boolean solved = false;
        while (!solved) {
            attempts++;
            boolean[] used = new boolean[64];
            for (int i = 0; i < 8; i++) {
                int sq;
                do { sq = rand.nextInt(64); } while (used[sq]);
                used[sq] = true;
                q[i] = sq;
            }
            solved = true;
            for (int i = 0; i < 8 && solved; i++)
                for (int j = i + 1; j < 8; j++)
                    if (attacks(q[i], q[j])) { solved = false; break; }
        }
        System.out.println("Random: solved after " + attempts + " attempts");
        show(q);
    }

    // b) exhaustive: tries combinations of 8 squares, rejecting attacking ones early
    static int solutions = 0;
    static int[] ex = new int[8];

    static void exhaustive(int start, int count) {
        if (count == 8) {
            if (solutions == 0) show(ex);
            solutions++;
            return;
        }
        for (int sq = start; sq < 64; sq++) {
            boolean safe = true;
            for (int i = 0; i < count; i++)
                if (attacks(ex[i], sq)) { safe = false; break; }
            if (safe) {
                ex[count] = sq;
                exhaustive(sq + 1, count + 1);
            }
        }
    }

    static void show(int[] q) {
        char[][] b = new char[8][8];
        for (char[] row : b) java.util.Arrays.fill(row, '.');
        for (int sq : q) b[sq / 8][sq % 8] = 'Q';
        for (char[] row : b) System.out.println(new String(row).replace("", " ").trim());
    }

    public static void main(String[] args) {
        randomSolve();
        exhaustive(0, 0);
        System.out.println("Exhaustive: " + solutions + " solutions found");
    }
}
