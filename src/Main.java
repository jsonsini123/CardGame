public class Main {
    public static void main(String[] args) {
        String[] ranks = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};
        String[] suits = new String[]{"Hearts", "Clubs", "Spades", "Diamonds"};
        int[] points = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10};
        Deck main = new Deck(ranks, suits, points);
        Player playerOne = new Player("Jake");
        Game game = new Game(playerOne, main);
        game.playGame();
    }
}