package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    public Connection conectaBD() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql:/"
                    + "/localhost:3306/JohnsBarbearia?serverTimezone=UTC",
                    "root", "");
            return conn;
        } catch (SQLException ex) {
            System.out.println("Deu ruim na conexão" + ex);
            return null;
        }

    }

}
