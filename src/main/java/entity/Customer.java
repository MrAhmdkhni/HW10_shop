package entity;

import java.util.List;

public class Customer {
    private int id;
    private final String firstName;
    private final String lastName;
    private final String nationalCode;
    private String username;
    private String password;
    private List<Basket> baskets;

    public Customer(String firstName, String lastName, String nationalCode, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
