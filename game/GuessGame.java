

public class GuessGame {

    public static void main(String args[]) {
        System.out.println("game start");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }

    static class Guesser {
        int guessNum;

        public int guessingNumber() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Guesser Enter the NO..");
            guessNum = scan.nextInt();
            scan.close();
            return guessNum;
        }
    }

    static class Player {
        int guessNum;

        public int guessingNumber() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Player enter the NO");
            guessNum = scan.nextInt();
            scan.close();
            return guessNum;
        }
    }

    static class Umpire {
        int data;
        int numFromPlayer1;
        int numFromPlayer2;
        int numFromPlayer3;

        public void collectNumFromGuesser() {
            Guesser g = new Guesser();
            data = g.guessingNumber();
        }

        public void collectNumFromPlayer() {
            Player p1 = new Player();
            Player p2 = new Player();
            Player p3 = new Player();
            numFromPlayer1 = p1.guessingNumber();
            numFromPlayer2 = p2.guessingNumber();
            numFromPlayer3 = p3.guessingNumber();
        }

        public void compare() {
            if (data == numFromPlayer1) {
                System.out.println("Player 1 is the winner");
            } else if (data == numFromPlayer2) {
                System.out.println("Player 2 is the winner");
            } else if (data == numFromPlayer3) {
                System.out.println("Player 3 is the winner");
            } else {
                System.out.println("No one is the winner");
            }
        }
    }
}
