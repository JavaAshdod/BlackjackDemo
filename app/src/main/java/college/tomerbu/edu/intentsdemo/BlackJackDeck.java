package college.tomerbu.edu.intentsdemo;

import android.content.res.Resources;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;

public class BlackJackDeck {

    private final Resources res;
    private ArrayList<BlackjackCard> cards;

    public BlackJackDeck(Resources res) {
        this.res = res;
        fillDeck();
    }

    private void fillDeck() {
        cards = new ArrayList<>();
        String[] suits = {"hearts", "diamonds", "spades", "clubs"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10"};



        for (String suit : suits) {
            for (String rank : ranks) {
                String cardName = "card_"+rank + "_of_" + suit;
                int id = res.getIdentifier(cardName, "drawable", "college.tomerbu.edu.intentsdemo");
                BlackjackCard card = new BlackjackCard(suit, rank, id);
                cards.add(card);
            }
        }

        ranks = new String[]{"jack", "queen", "king", "ace"};
        for (String suit : suits) {
            for (String rank : ranks) {
                String cardName = rank + "_of_" + suit;
                int id = res.getIdentifier(cardName, "drawable", getClass().getPackage().getName());

                BlackjackCard card = new BlackjackCard(suit, rank, id);
                cards.add(card);
            }
        }

        shuffle();
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    @Nullable
    public BlackjackCard draw(){
        try {
            return cards.remove(0);
        }
        catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            return null;
        }
    }

    public void reset(){
        fillDeck();
    }
}
