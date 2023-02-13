import java.util.Scanner;
public class Game {
    //instance variables
    private Player player;
    private Deck deck;
    //initialize variables
    private GameViewer game;
    public Game(Player player, Deck deck){
        this.game = new GameViewer(this);
        this.deck = deck;
        this.player = player;
    }
    //give information on how to play game
    public void printInstructions(){
        System.out.println("This game is BlackJack, the objective of this game\n " +
                "is to get as close to 21 without going over\n " +
                "you are playing against the computer. So, in order to play add cards to your hand\n " +
                "and either type 'hit' to add a card and type 'stand' to hold your cards\n " +
                "after typing stand you will be compared to the computer to see if you won\n");
    }
    //plays a new game of blackjack
    public void playGame(){
        //shuffle deck and print instructions
        printInstructions();
        boolean run = true;
        Card Draw;
        deck.shuffle();
        Draw = deck.deal();
        game.setHand(Draw);
        game.repaint();
        int points = Draw.getPoint();
        //while you have not lost or enter stand, continue to ask for player input
        while (run == true){
            System.out.println("You have " + points + " points");
            Scanner s = new Scanner(System.in);
            System.out.println("Do you want to hit or stand?:");
            String input = s.nextLine();
            if (input.equals("hit")){
                Draw = deck.deal();
                game.setHand(Draw);
                game.repaint();
                points += Draw.getPoint();
            }
            else if (input.equals("stand")){
                run = false;

            }
            if (points > 21){
                System.out.println("You Lose, you went over 21 :(");
                game.setMessage("You Lose, you went over 21 :(");
                game.repaint();
                return;
            }
        }
        //after hitting stand compare user input to computer input
        int computer = (int) (Math.random() * 10) + 15;
        if (computer > 21){
            System.out.println("Computer received " + computer + " points" +
                    " you received " + points + " so you win! :)");
            game.setMessage("Computer received " + computer + " points" +
                    " you received " + points + " so you win! :)");
            game.repaint();
            return;
        }
        else{
            if (computer > points){
                System.out.println("Computer scored higher, you lose :(");
                game.setMessage("Computer scored higher, you lose :(");
                game.repaint();
                return;
            }
            else if (computer == points){
                System.out.println("You and computer tied! :/");
                game.setMessage("You and computer tied! :/");
                game.repaint();
                return;
            }
            else{
                System.out.println("You win! :)");
                game.setMessage("You win! :)");
                game.repaint();
                return;
            }
        }
    }
}
