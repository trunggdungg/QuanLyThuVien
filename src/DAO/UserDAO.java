package DAO;

import controler.ConnectionMySQL;
import static controler.ConnectionMySQL.getJDBCConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import qltv.TKMK;

public class UserDAO {
    public List<TKMK> getAllUsers() {
        List<TKMK> userList = new ArrayList<>();

        try (Connection connection = ConnectionMySQL.getJDBCConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM TKMK")) {

            while (resultSet.next()) {
                String user = resultSet.getString("user");
                String password = resultSet.getString("password");

                TKMK u = new TKMK();
                u.setTK(user);
                u.setMK(password);

                userList.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }
}
