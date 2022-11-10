
package DAO;
import DAO.ConexaoDAO;
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
    String url = "jdbc:mysql://localhost:3306/JohnsBarbearia?user=root&password=";
    Connection conn;
    public ConexaoDAOTest() {
    }
    
    
    @Before
    public void setUp() {
        
    }
    

    @Test
    public void TestarConexãoComOBancoDeDados() throws SQLException {
      
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
             System.out.println("Deu ruim na conexão");
        }
   
//      SQLException erro = assertThrows( SQLException.class, ()->
//              DriverManager.getConnection(url));
     
       // assertEquals(erro, "Deu ruim na conexão");
      //  assertThrows("Deu ruim na conexão", e, conn);
    }
    
}
