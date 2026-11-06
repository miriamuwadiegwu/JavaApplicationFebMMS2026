import java.util.Random;

public class TortoiseAndHare {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        int tortoise = 1, hare = 1;

        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");

        while (tortoise < 70 && hare < 70) {
            int i = 1 + rand.nextInt(10);
            if (i <= 5) tortoise += 3;        // fast plod
            else if (i <= 7) tortoise -= 6;   // slip
            else tortoise += 1;               // slow plod
            if (tortoise < 1) tortoise = 1;

            int j = 1 + rand.nextInt(10);
            if (j <= 2) { }                   // sleep
            else if (j <= 4) hare += 9;       // big hop
            else if (j == 5) hare -= 12;      // big slip
            else if (j <= 8) hare += 1;       // small hop
            else hare -= 2;                   // small slip
            if (hare < 1) hare = 1;

            char[] line = new char[70];
            java.util.Arrays.fill(line, ' ');
            int t = Math.min(tortoise, 70), h = Math.min(hare, 70);
            if (t == h) {
                String ouch = "OUCH!!!";
                for (int k = 0; k < ouch.length() && t - 1 + k < 70; k++)
                    line[t - 1 + k] = ouch.charAt(k);
            } else {
                line[t - 1] = 'T';
                line[h - 1] = 'H';
            }
            System.out.println(new String(line));
            Thread.sleep(1000); // clock ticks once per second; delete to run instantly
        }

        if (tortoise >= 70) System.out.println("TORTOISE WINS!!! YAY!!!");
        else System.out.println("Hare wins. Yuch.");
    }
}