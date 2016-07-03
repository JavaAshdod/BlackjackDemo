package college.tomerbu.edu.intentsdemo;

/**
 * Created by stud27 on 03/07/16.
 */
public class BlackjackCard {
    private String suit;
    private String rank;
    private int imageResId;

    //Constructor
    public BlackjackCard(String suit, String rank, int imageResId) {
        this.suit = suit;
        this.rank = rank;
        this.imageResId = imageResId;
    }

    //getters and setters
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    @Override
    public String toString() {
        return "BlackjackCard{" +
                "suit='" + suit + '\'' +
                ", rank='" + rank + '\'' +
                ", imageResId=" + imageResId +
                '}';
    }
}
