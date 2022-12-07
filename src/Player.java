import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;
    private int points;
    private String name;
    public Player(String name){
        this.name = name;
        points = 0;
    }
    public Player(String name, Deck cards){

        hand = cards;
        points = 0;
    }
    public void addPoints(int points){
        this.points += points;
    }
    public void addCard
}
