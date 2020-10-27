package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static JDBC.GetList.getConnection;

public class Order {
    private static String DB_URL = "jdbc:mysql://localhost:3306/db_user";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";

    public static void main(String[] args) {
        try {
            Connection connection = getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user ORDER BY name");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2)
                        + " " + resultSet.getString(3));
            }

            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
