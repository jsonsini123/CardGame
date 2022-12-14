public class Card {
    //declare instance variables
    private String rank;
    private String suit;
    private int point;

    //fill in value in constructor
    public Card(String rank, String suit, int point){
        this.rank = rank;
        this.point = point;
        this.suit = suit;
    }
    //return rank
    public String getRank() {
        return rank;
    }

    //set new rank
    public void setRank(String rank) {
        this.rank = rank;
    }

    //return suit
    public String getSuit() {
        return suit;
    }

    //set new suit
    public void setSuit(String suit) {
        this.suit = suit;
    }

    //return point
    public int getPoint() {
        return point;
    }

    //set new point
    public void setPoint(int point) {
        this.point = point;
    }

    //return an easy-to-read description of a card
    public String toString(){
        return rank + " of " + suit;
    }
}
