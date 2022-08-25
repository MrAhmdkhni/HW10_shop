package entity;

import entity.enums.ReadableType;

public class Text extends Product{
    private String type;
    //private ReadableType type;
    private String name;// final?
    private String writer;// final?

    public Text(double price, int quantity, String type, String name, String writer) {
        super(price, quantity);
        this.type = type;
        this.name = name;
        this.writer = writer;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getWriter() {
        return writer;
    }
}
