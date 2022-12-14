//BlackJack by: Jake Sonsini
public class Main {
    public static void main(String[] args) {
        //make arrays to hold card values
        String[] ranks = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};
        String[] suits = new String[]{"Hearts", "Clubs", "Spades", "Diamonds"};
        int[] points = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10};
        //make a new deck to be used by player one
        Deck main = new Deck(ranks, suits, points);
        //initialize player one
        Player playerOne = new Player("Jake");
        //make and run a game
        Game game = new Game(playerOne, main);
        game.playGame();
    }
}