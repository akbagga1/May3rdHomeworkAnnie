public class House extends Building {
    private final int width;
    private final int height;
    private final float price;
    private final String color;
    private int rooms;


    public House(int width, int height, float price, String color, int rooms) {
        super(width, height, price, color);
        this.width = width;
        this.height = height;
        this.price = price;
        this.color = color;
        this.rooms = rooms;
    }
}

