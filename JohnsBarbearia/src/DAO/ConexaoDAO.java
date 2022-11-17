package DAO;
import Exceptions.NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/JohnsBarbearia?serverTimezone=UTC";
    String usuario = "root";
    String senha = "";

    public Connection conectaBD() throws NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException {
        try {
            conn = DriverManager.getConnection(url, usuario, senha);
            return conn;
        } catch (SQLException ex) {
            System.out.println("erro na conexão"+ ex);
            throw new NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException();
        }
       // return null;
    }    
}