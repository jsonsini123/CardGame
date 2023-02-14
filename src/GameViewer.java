import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameViewer extends JFrame{
    // Set window height and width
    private final int WINDOW_WIDTH = 1000;
    private final int WINDOW_HEIGHT = 1000;
    private Game game;
    // Set card values for interpreting in the paint method
    private Card card;
    private Card cardprevious;
    private String message;
    private ArrayList<Card> cards;
    private int points = 0;
    private final int shift = 50;
    public GameViewer(Game game){
        // Initialize array and game instance variable
        cards = new ArrayList<Card>();
        this.game = game;
        // Create GUI
        this.setTitle("Card Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }
    // Set values for communicating between front end and back end
    public void setHand(Card card){
        this.card = card;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public void setPoints(int points){
        this.points = points;
    }
    public void paint(Graphics g){
        // Paint the background and text with current data in
        g.drawImage(new ImageIcon("Resources/download.jpg").getImage(), 0, 0, 1000, 1000, this);
        g.drawImage(new ImageIcon("Resources/back.png").getImage(), 200, 500, 150, 225,this);
        g.setFont(new Font("Font", Font.TYPE1_FONT, 30));
        g.setColor(Color.yellow);
        g.drawString("Do you want to hit or stand?", 300, 300);
        g.drawString("Current Total: " + points, 200, 250);
        g.setColor(Color.red);
        g.drawString("Blackack By: Jake Sonsini", 300, 100);
        card.drawCard(g, 350, 500, this);
        // Check to see if there are any card values or if a new card has been drawn
        if (card != null && card != cardprevious){
            // Add hand to arraylist
            cards.add(card);
            // Set cardprevious for no double printing of images
            cardprevious = card;
            // Iterate through hand and print them offset from another using the shift variable
            for(int i = 0; i < cards.size(); i++){
                cards.get(i).drawCard(g, 350 + shift * i, 500, this);
            }
        }
        // Check if the game is over and if so call hte displayMessage method
        if (message != null){
            displayMessage(g, message);
        }
    }
    // displayMessage is a function that is called at the end of the game to debrief the player
    public void displayMessage(Graphics g, String message){
        // Set background info
        g.drawImage(new ImageIcon("Resources/download.jpg").getImage(), 0, 0, 1000, 1000, this);
        g.drawImage(new ImageIcon("Resources/back.png").getImage(), 200, 500, 150, 225,this);
        g.setColor(Color.red);
        g.drawString("Blackack By: Jake Sonsini", 300, 100);
        g.setFont(new Font("Font", Font.TYPE1_FONT, 30));
        g.setColor(Color.yellow);
        // Print the game ending message with the final total
        g.drawString(message, 200, 200);
        g.drawString("Final Total: " + points, 200, 250);
    }
}
