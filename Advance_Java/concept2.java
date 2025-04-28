package Advance_Java;

enum Laptop {
    Lenovo(1000), ASUS(2000), Apple(3000), HP(4000);

    private int price;

    // Paramtirized constructor
    private Laptop(int price) {
        this.price = price;
    }

    // Non parametirized constructor
    private Laptop() {

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class concept2 {
    public static void main(String[] args) {

        Laptop[] l = Laptop.values();

        for (Laptop a : l) {
            System.out.println(a + ":" + a.getPrice());
        }
    }
}
