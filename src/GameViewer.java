import javax.swing.*;
import java.awt.*;
public class GameViewer extends JFrame{
    private final int WINDOW_WIDTH = 1000;
    private final int WINDOW_HEIGHT = 1000;
    //ask blick about putting images in the card class and if that is bad code fluency
    private Game game;
    private Card card;
    private String message;
    public GameViewer(Game game){
        this.game = game;
        //set card images based off of suit and rank so that every card has unique image
        //initialize all images
        this.setTitle("Card Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }
    public void setHand(Card card){
        this.card = card;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public void paint(Graphics g){
        g.drawRect(0, 0, 1000, 1000);
        g.drawImage(new ImageIcon("Resources/back.png").getImage(), 200, 500, 100, 200,this);
        if (card != null){
            card.drawCard(g, 500, 500, this);
        }
        if (message != null){
            displayMessage(g, message);
        }
        //use google slides to make background image
        //access card image using getImage with suit and rank as input
        //draw deck different titles and current hand
    }
    public void displayMessage(Graphics g, String message){
        g.setFont(new Font("Font", Font.TYPE1_FONT, 30));
        g.setColor(Color.yellow);
        g.drawString(message, 200, 200);
    }
    //make a game ending method that takes in a string and prints out the message
}
