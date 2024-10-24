//thông tin và điểm của người chơi
public class Player {
    private String name;
    private int score;
    private int hitconsecutive; // số lần đánh liên tiếp
    // constructor
    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.hitconsecutive = 0;
    }
    // lấy giá trị tên và điểm
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    // Phương thức tính điểm bắn ong
    public void hitBee(Bee bee) {
        int points = bee.getScore();
        int totalPoints = points;
        // kiểm tra số lần bắn trúng ong liên tiếp
        if(hitconsecutive > 3) {
            // điểm nhân đôi
            totalPoints = totalPoints * 2;
        }
        score += totalPoints;
        hitconsecutive++;
        //lấy tên theo giá trị của kiểu ong
        TypeBee typeName = TypeBee.getTypeBee(points);
        System.out.println(name + " đã bắn vào ong " + typeName + " - " + totalPoints + " điểm");
    }
    // khi bắn trượt ong
    public void missBee() {
        hitconsecutive = 0;
        System.out.println(name + " đã bắn trượt");
    }
}
