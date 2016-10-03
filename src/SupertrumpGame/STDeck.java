package SupertrumpGame;

import java.util.ArrayList;
import java.util.Random;

public class STDeck {

    private static final int DECK_SIZE = 60;
    private ArrayList<STCard> cards;

    //todo: list of all cards

    public STDeck(){
        cards = new ArrayList<STCard>();

        for (int i = 0; i < DECK_SIZE; i++) {
            cards.add(new STCard(i));
            //google how to create of random array of integers
        }
    }

    public ArrayList<STCard> dealCards(int nCards) {
        ArrayList<STCard> ret = new ArrayList<STCard>();
        for (int i = 0; i < nCards; i++){
            int idx = new Random().nextInt(cards.size());
            STCard card = cards.remove(idx);
            ret.add(card);
            //System Prints all card ids in deck. Helps with Debugging
            System.out.println("card = " + card);
        }
        return ret;
    }
}
