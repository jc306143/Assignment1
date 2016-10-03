package SupertrumpGame;
import javax.swing.*;
import java.util.Scanner;

public class Main {

    private static final int NEW_GAME = 1;
    public static void main(String[] args) {

        showWelcome();
        int opt = getUserMenuChoice();
        STGame game;
        if(opt == NEW_GAME){
            game = startNewGame();
            game.playTheGame();
        }
    }

    private static STGame startNewGame(){
        int numPlayers = getNumPlayers();
        STGame game = new STGame(numPlayers);
        game.selectDealer();
        game.dealRandomCards();

        game.selectYouAsPlayer();

        STPlayer humPlayer = game.getHumPlayer();
        showPlayer(humPlayer);

//        game.playTheGame{};
//        game.ShowHumPlayerCards[];
        return game;
    }

    private static void showPlayer(STPlayer humPlayer) {
        System.out.println("Hum player=" + humPlayer);
    }

    private static int getNumPlayers() {
        int n;

        Scanner entry = new Scanner(System.in);

        //Loops until user inuts valid number
        while (true) {
            System.out.println("How many Players?");
            n = entry.nextInt();

            if (n <= 2 || n >=6){
                System.out.println("Invalid number of Players");
            }
            else {
                break;
            }
        }
        return n;
    }
    //Checks if user wants to play Mineral Supertrump
    private static int getUserMenuChoice() {
        if (JOptionPane.showConfirmDialog(null, "Want to play a Game of Mineral Supertrump?", "Mineral Supertrumps",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            return 1;
        } else {
            System.out.println("GoodBye");
            return 0;
        }
    }

    private static void showWelcome(){
        //Welcome Message
        System.out.println("Hello");
    }
}
