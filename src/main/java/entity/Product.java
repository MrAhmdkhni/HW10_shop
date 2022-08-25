package entity;

public class Product {
    protected int id;
    protected double price;
    protected int quantity;
    protected boolean doesExist;

    public Product(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
        this.doesExist = true;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean getDoesExist() {
        return doesExist;
    }
    public void setDoesExist(boolean doesExist) {
        this.doesExist = doesExist;
    }
}
