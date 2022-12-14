import java.util.ArrayList;
public class Deck {
    //instance variables
    private ArrayList<Card> cards;
    private int cardsLeft = 0;

    //make a new deck using input variables and set card size
    public Deck(String[] ranks, String[] suits, int[] values){
        cards = new ArrayList<Card>();
        for (int i = 0; i < ranks.length; i++){
            for (int j = 0; j < suits.length; j++)
                cards.add(new Card(ranks[i], suits[j], values[i]));
        }
        cardsLeft = cards.size();
    }
    //check if the deck is empty
    public boolean isEmpty(){
        if (cardsLeft > 0){
            return false;
        }
        return true;
    }
    //return how many cards are left in the deck
    public int getCardsLeft(){
        return cardsLeft;
    }

    //remove and return the top part of the deck
    public Card deal(){
        cardsLeft--;
        return cards.get(cardsLeft);
    }

    //shuffle the cards by randomly switching card values
    public void shuffle(){
        cardsLeft = cards.size();
        for (int i = cards.size() - 1; i >= 0; i--){
            int r = (int)(Math.random() * i) + 1;
            Card temp = cards.get(i);
            cards.set(i, cards.get(r));
            cards.set(r, temp);
        }
    }
}
