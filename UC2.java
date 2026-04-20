import java.util.Random;

public class UC2 {

    static char currentPlayer;
    static char player1Symbol;
    static char player2Symbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayGameState();
    }

    static void tossAndAssignSymbols() {
        Random rand = new Random();
        int toss = rand.nextInt(2); // 0 or 1

        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = player1Symbol;
            System.out.println("Player 1 starts.");
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = player2Symbol;
            System.out.println("Player 2 starts.");
        }
    }

    static void displayGameState() {
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
        System.out.println("Current Player Symbol: " + currentPlayer);
    }
}