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
        //use deck methods to add cards to hand
        while (cards.isEmpty() == false){
            hand.add(cards.deal());
        }
    }
    public void addPoints(int points){
        this.points += points;
    }
    public void addCard(Card c){
        hand.add(c);
    }
    public String toString(){
        return name + " has " + points + " points\n" + name + "'s cards" + hand;
    }
}
