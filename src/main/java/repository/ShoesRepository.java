package repository;

import config.DBConfig;
import entity.Customer;
import entity.Shoes;
import entity.enums.ShoesType;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShoesRepository {

    public void add(Shoes shoes) throws SQLException {
        String query = """
                insert into shoes (type, size , price, quantity, does_exist)
                values (?, ?, ?, ?, true)
                """;
        try (PreparedStatement preparedStatement = DBConfig.getConnection().prepareStatement(query)) {
            preparedStatement.setString(1, String.valueOf(shoes.getType()));
            preparedStatement.setInt(2, shoes.getSize());
            preparedStatement.setDouble(3, shoes.getPrice());
            preparedStatement.setInt(4, shoes.getQuantity());
            preparedStatement.executeUpdate();
        }
    }

    public List loadAllShoes() throws SQLException {
        String query = """
                select * from shoes (type, size , price, quantity, does_exist)
                where does_exist = true 
                """;
        try (PreparedStatement preparedStatement = DBConfig.getConnection().prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Shoes> shoesList = new ArrayList<>();
            while (resultSet.next()){
                Shoes shoes = new Shoes(
                        resultSet.getDouble("price"),
                        resultSet.getInt("quantity"),
                        ShoesType.valueOf(resultSet.getString("type")),
                        resultSet.getInt("size")
                );
                shoesList.add(shoes);
            }
            return shoesList;
        }
    }
}
