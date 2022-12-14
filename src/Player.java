import java.util.ArrayList;

public class Player {
    //instance variables
    private ArrayList<Card> hand;
    private int points;
    private String name;
    //set name if not given deck of cards
    public Player(String name){
        this.name = name;
        points = 0;
    }
    //set name and set deck to hand
    public Player(String name, Deck cards){
        //use deck methods to add cards to hand, adding cards till cards is empty
        while (cards.isEmpty() == false){
            hand.add(cards.deal());
        }
    }
    //increase points
    public void addPoints(int points){
        this.points += points;
    }
    //add new card to hand
    public void addCard(Card c){
        hand.add(c);
    }
    //return player info
    public String toString(){
        return name + " has " + points + " points\n" + name + "'s cards" + hand;
    }
}
