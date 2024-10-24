// enum là kiểu dữ liệu đặc biệt được sử dụng đại diện cho hằng số cố định
// enum có thể chứa các trường, phương thức và constructor
// Tạo kiểu của ong
enum TypeBee {
    SMALL(10), MEDIUM(20), BIG(30);
    private final int value;
    TypeBee(int value) {
        this.value = value;
    }
    // lấy giá trị của ong
    public int getValue() {
        return value;
    }
    //Lấy tên theo giá trị của ong
    public static TypeBee getTypeBee(int value) {
        for (TypeBee typeBee : TypeBee.values()) {
            if (typeBee.getValue() == value) {
                return typeBee;
            }
        }
        return null;
    }
}

public class Bee {
    private TypeBee type;
    public Bee(TypeBee type) {
        this.type = type;
    }
    //trả về giá trị điểm của loại ong
    public int getScore() {
        return type.getValue();
    }
}
