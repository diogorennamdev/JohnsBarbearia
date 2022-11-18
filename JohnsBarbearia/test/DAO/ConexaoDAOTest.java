package DAO;

import DAO.ConexaoDAO;
import Exceptions.NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static sun.jvm.hotspot.HelloWorld.e;

public class ConexaoDAOTest {

    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/JohnsBarbearia?serverTimezone=UTC";
    String usuario = "root";
    String senha = "";

    public ConexaoDAOTest() {
    }

    @Before
    public void setUp() {
        
    }

    @Test
    public void TestarConexãoComOBancoDeDados() throws NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException, SQLException {
        conn = DriverManager.getConnection(url, usuario, senha);
       // System.out.println("Banco conectado com sucesso!");
        assertNotNull(conn);
    }


}
