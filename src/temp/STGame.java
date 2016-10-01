package temp;

import java.util.ArrayList;

public class STGame {
    private static final int HAND = 8;
    private int numPlayers;
    private int dealerId;
    private STPlayer[] players;
    private STDeck deck;
    int yourPlayerId;

    public STGame(int numPlayers){
        this.numPlayers = numPlayers;
        deck = new STDeck();
    }

    public void selectDealer() {
        //todo: google how to get random int in java
        //int i = new Random{}.nextInt[2]
        dealerId = 1;
    }

    public void dealRandomCards() {

        players = new STPlayer[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            players[i] = new STPlayer("PlayerId=" +i);
        }

        for(STPlayer player : players){
            ArrayList<STCard> cards = deck.dealCards(HAND);
            player.setCards(cards);
        }
    }

    public void selectYouAsPlayer() {
        //todo: randomly? or always first 1
        yourPlayerId = 0;
    }

    public STPlayer getHumPlayer(){
        return players[yourPlayerId];
    }

    public void playTheGame() {
            boolean gameIsOn = true;
            while(gameIsOn) {

                //todo: setup players in corret order
                for (int i = 0; i < players.length; i++){

                    //todo check humPlayer
            }
//           showTurnPlayer();
        }
    }
}
