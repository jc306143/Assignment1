package temp;

public class Main {

    private static final int NEW_GAME = 1;
    public static void main(String[] args) {

        showWelcome();
        showMenu();
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
        //todo: see prac
        return 3;
    }
    private static int getUserMenuChoice() {
        //todo: see prac
        return 1;
    }

    private static void showMenu(){
        System.out.println("1. Start Game");
        System.out.println("2. Exit");
    }

    private static void showWelcome(){
        System.out.println("Hello");
    }
}
