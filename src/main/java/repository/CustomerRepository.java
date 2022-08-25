package repository;

import config.DBConfig;
import entity.Customer;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerRepository {
    // sign up customer
    public void save(Customer customer) throws SQLException {
        String query = """
                insert into customer (first_name, last_name, national_code, username, password)
                values (?, ?, ?, ?, ?)
                """;
        try (PreparedStatement preparedStatement = DBConfig.getConnection().prepareStatement(query)) {
            preparedStatement.setString(1, customer.getFirstName());
            preparedStatement.setString(2, customer.getLastName());
            preparedStatement.setString(3, customer.getNationalCode());
            preparedStatement.setString(4, customer.getUsername());
            preparedStatement.setString(5, customer.getPassword());
            preparedStatement.executeUpdate();
        }
    }

    // log in customer
    public void loadByUserAndPass(String username, String password) throws SQLException {
        String query = """
                select * from customer
                where username = ? and password = ?;
                """;
        try (PreparedStatement preparedStatement = DBConfig.getConnection().prepareStatement(query)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.executeQuery();
        }
    }
}
