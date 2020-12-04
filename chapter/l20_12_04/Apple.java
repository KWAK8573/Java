package chapter.l20_12_04;

public class Apple {
    private String kind;
    private int weight;
    private int price;
    private String color;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Apple(String kind, int weight, int price, String color) {
        super();
        this.kind = kind;
        this.weight = weight;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple [color=" + color + ", kind=" + kind + ", price=" + price + ", weight=" + weight + "]";
    }

    



}