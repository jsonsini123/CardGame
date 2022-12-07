import java.util.ArrayList;
public class Deck {
    private ArrayList<Card> cards;
    private int cardsLeft = 0;
    public Deck(String[] ranks, String[] suits, int[] values){
        for (int i = 0; i < ranks.length; i++){
            for (int j = 0; j < suits.length; j++) {
                cards.add(new Card(ranks[i], suits[j], values[i]));
            }
        }
        cardsLeft = cards.size();
    }
    public boolean isEmpty(){
        if (cardsLeft > 0){
            return false;
        }
        return true;
    }
    public void getCardsLeft(){
        return cardsLeft;
    }
    public void Shuffle(){
        for (int i = 0; i < cards.size(); i++){
            int swap = Math.random() * cards.size() + 1;

        }
    }
    public Card deal(){
        cardsLeft--;
        return cards.get(cardsLeft);
    }
    public void shuffle(){
        cardsLeft = cards.size();
        for (int i = cards.size(); i > 0; i--){
            int r = (int)(Math.random() * i + 1);
            Card temp = new Card(cards.get(r));
            cards.set(r, cards.get(i));
            cards.set(i, temp);
        }
    }
}
