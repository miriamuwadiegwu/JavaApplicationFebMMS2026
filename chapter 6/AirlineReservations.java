import java.util.Scanner;

public class AirlineReservations {
    static int findSeat(boolean[] seats, int from, int to) {
        for (int i = from; i <= to; i++)
            if (!seats[i]) return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean[] seats = new boolean[10];
        int assigned = 0;

        while (assigned < 10) {
            System.out.println("Please type 1 for First Class");
            System.out.println("Please type 2 for Economy");
            int choice = in.nextInt();
            if (choice != 1 && choice != 2) continue;

            int seat = (choice == 1) ? findSeat(seats, 0, 4) : findSeat(seats, 5, 9);

            if (seat == -1) {
                String other = (choice == 1) ? "Economy" : "First Class";
                System.out.print("That section is full. Is " + other + " acceptable? (y/n): ");
                if (in.next().equalsIgnoreCase("y"))
                    seat = (choice == 1) ? findSeat(seats, 5, 9) : findSeat(seats, 0, 4);
                else {
                    System.out.println("Next flight leaves in 3 hours.");
                    continue;
                }
            }

            seats[seat] = true;
            assigned++;
            System.out.println("---- BOARDING PASS ----");
            System.out.println("Seat number: " + (seat + 1));
            System.out.println("Section: " + (seat < 5 ? "First Class" : "Economy"));
            System.out.println("-----------------------");
        }
        System.out.println("The plane is full.");
    }
}