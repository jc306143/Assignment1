package temp;

import java.util.ArrayList;

/**
 * Created by Jack on 5/09/2016.
 */
public class STPlayer {
    private ArrayList<STCard> cards;
    private String playerId;

    public STPlayer(String playerId) {
        this.playerId = playerId;
    }

    public void setCards(ArrayList<STCard> cards) {
        this.cards = cards;
    }

    public String toString() {
        return "PlayerID=" + playerId + "\n cards=" +cards;
    }
}
