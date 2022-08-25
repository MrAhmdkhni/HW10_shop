package entity;

import entity.enums.ShoesType;

public class Shoes extends Product{
    private ShoesType type;// final?
    private int size;// final?

    public Shoes(double price, int quantity, ShoesType type, int size) {
        super(price, quantity);
        this.type = type;
        this.size = size;
    }

    public ShoesType getType() {
        return type;
    }

    public int getSize() {
        return size;
    }
}
