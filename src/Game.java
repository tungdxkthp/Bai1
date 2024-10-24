import java.util.Random;

// thiết lập trò chơi có 10 lượt bắn
public class Game {
    private Player player;
    // constructor
    public Game(Player player) {
        this.player = player;
    }
    // tính tổng điểm đã bắn trúng ong
    public void StartGame() {
        Random rand = new Random();
        for (int i=0;i<10;i++) {
            // 50% cơ hội bắn trúng ong
            if (rand.nextBoolean()) {
                TypeBee typeBee =TypeBee.values()[rand.nextInt(TypeBee.values().length)];
                Bee bee = new Bee(typeBee);
                player.hitBee(bee);
            }
            else {
                player.missBee();
            }
        }
        System.out.println("Tổng điểm của " + player.getName() + ": " + player.getScore() + " điểm");
    }
}
