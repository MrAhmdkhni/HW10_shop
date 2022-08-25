package repository;

import config.DBConfig;
import entity.Electronic;
import entity.Text;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TextRepository {

    public void add(Text text) throws SQLException {
        String query = """
                insert into electronic (type, name, writer, price, quantity, does_exist)
                values ( ?, ?, ?, ?, ?, true)
                """;
        try (PreparedStatement preparedStatement = DBConfig.getConnection().prepareStatement(query)) {
            preparedStatement.setString(1, text.getType());
            preparedStatement.setString(2, text.getName());
            preparedStatement.setString(3, text.getWriter());
            preparedStatement.setDouble(4, text.getPrice());
            preparedStatement.setInt(5, text.getQuantity());
            preparedStatement.executeUpdate();
        }
    }
}
