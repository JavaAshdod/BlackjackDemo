package college.tomerbu.edu.intentsdemo;

import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by stud27 on 03/07/16.
 */
//TODO: fix the cards image...
public class BlackJackDeck {
    private ArrayList<BlackjackCard> cards;

    public BlackJackDeck() {
        fillDeck();
    }

    private void fillDeck() {
        cards = new ArrayList<>();
        String[] suits = {"♥", "♦", "♣", "♠"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};


        for (String suit : suits) {
            for (String rank : ranks) {
                //TODO: Fix image paths
                BlackjackCard card = new BlackjackCard(suit, rank, R.drawable.ace_of_clubs);
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
