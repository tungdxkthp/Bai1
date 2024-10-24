public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player A");
        Game game = new Game(player1);
        game.StartGame();

        //Player player2 = new Player("Player B");
        //Game game2 = new Game(player2);
        //game2.StartGame();
    }
}