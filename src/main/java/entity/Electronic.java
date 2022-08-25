package entity;

import entity.enums.ElectronicType;

public class Electronic extends Product {
    private String type; // final?
    //private ElectronicType type;
    private String producer; // final?
    private String model;

    public Electronic(double price, int quantity, String type, String producer, String model) {
        super(price, quantity);
        this.type = type;
        this.producer = producer;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }
}
