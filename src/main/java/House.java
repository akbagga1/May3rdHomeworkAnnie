import java.util.ArrayList;

public class House extends Building {
    private final int width;
    private final int height;
    private final float price;
    private final String color;
    private ArrayList<Rooms> rooms;


    public House(int width, int height, float price, String color, ArrayList<Rooms> rooms) {
        super(width, height, price, color);
        this.width = width;
        this.height = height;
        this.price = price;
        this.color = color;
        this.rooms = rooms;
    }
}

