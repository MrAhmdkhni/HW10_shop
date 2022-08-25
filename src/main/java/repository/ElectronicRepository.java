package repository;

import config.DBConfig;
import entity.Electronic;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ElectronicRepository {

    public void add(Electronic electronic) throws SQLException {
        String query = """
                insert into electronic (type, producer, model, price, quantity, does_exist)
                values ( ?, ?, ?, ?, ?, true )
                """;
        try (PreparedStatement preparedStatement = DBConfig.getConnection().prepareStatement(query)) {
            preparedStatement.setString(1, String.valueOf(electronic.getType()));
            preparedStatement.setString(2, electronic.getProducer());
            preparedStatement.setString(3, electronic.getModel());
            preparedStatement.setDouble(4, electronic.getPrice());
            preparedStatement.setInt(5, electronic.getQuantity());
            preparedStatement.executeUpdate();
        }
    }

}
