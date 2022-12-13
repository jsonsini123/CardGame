import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Player player;
    private Deck deck;
    public Game(Player player, Deck deck){
        this.deck = deck;
        this.player = player;
    }
    public void printInstructions(){
        System.out.println("This game is BlackJack, the objective of this game " +
                "is to get as close to 21 without going over " +
                "you are playing against the computer so to play add cards to your hand " +
                "adn either type 'hit' to add a card and type 'stand' to hold your cards " +
                "after typing stand you will be compared to the computer to see if you won");
    }
    public void playGame(){
        boolean run = true;
        Card Draw;
        deck.shuffle();
        Draw = deck.deal();
        int points = Draw.getPoint();
        while (run == true){
            System.out.println("You have " + points + " points");
            Scanner s = new Scanner(System.in);
            System.out.println("Do you want to hit or stand?:");
            String input = s.nextLine();
            if (input.equals("hit")){
                Draw = deck.deal();
                points += Draw.getPoint();
            }
            else if (input.equals("stand")){
                run = false;

            }
            if (points > 21){
                System.out.println("You Lose, you went over 21 :(");
                return;
            }
        }
        int computer = (int) (Math.random() * 10) + 15;
        if (computer > 21){
            System.out.println("Computer received " + computer + " points" +
                    " you received " + points + " so you win! :)");
            return;
        }
        else{
            if (computer > points){
                System.out.println("Computer scored higher, you lose :(");
                return;
            }
            else if (computer == points){
                System.out.println("You and computer tied! :/");
                return;
            }
            else{
                System.out.println("You win! :)");
                return;
            }
        }
    }
}
