package entity;

import java.util.List;

public class Basket {
    private int id;
    private int customerId;
    private int productId;
    private int quantity ;
    private double totalPrice;
    private boolean isConfirm;
    private List<Product> products;

    public Basket(int customerId, int productId, int quantity, double totalPrice, boolean isConfirm) {
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.isConfirm = isConfirm;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean getIsConfirm() {
        return isConfirm;
    }
    public void setIsConfirm(boolean confirm) {
        isConfirm = confirm;
    }
}
