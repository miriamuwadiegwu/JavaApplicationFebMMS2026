public class TurtleGraphics {
    public static void main(String[] args) {
        int[][] floor = new int[20][20];
        // each command is {code} or {5, spaces}; 9 = end of data
        int[][] program = {
            {2}, {5, 12}, {3}, {5, 12}, {3}, {5, 12}, {3}, {5, 12},
            {1}, {6}, {9}
        };

        int row = 0, col = 0;
        int dir = 0; // 0=right, 1=down, 2=left, 3=up
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        boolean penDown = false;

        for (int[] cmd : program) {
            if (cmd[0] == 9) break;
            switch (cmd[0]) {
                case 1: penDown = false; break;
                case 2:
                    penDown = true;
                    floor[row][col] = 1;
                    break;
                case 3: dir = (dir + 1) % 4; break;
                case 4: dir = (dir + 3) % 4; break;
                case 5:
                    for (int i = 0; i < cmd[1]; i++) {
                        int nr = row + dr[dir], nc = col + dc[dir];
                        if (nr < 0 || nr >= 20 || nc < 0 || nc >= 20) break;
                        row = nr;
                        col = nc;
                        if (penDown) floor[row][col] = 1;
                    }
                    break;
                case 6:
                    for (int[] line : floor) {
                        for (int cell : line)
                            System.out.print(cell == 1 ? "* " : "  ");
                        System.out.println();
                    }
                    break;
            }
        }
    }
}