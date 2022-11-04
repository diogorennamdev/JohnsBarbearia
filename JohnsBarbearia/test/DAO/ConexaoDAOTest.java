
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


public class ConexaoDAOTest {
    String url = "jdbc:mysql://localhost:3306/JohnsBarbearia?user=root&password=";
    Connection conn;
    public ConexaoDAOTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
   
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testConectaBD() {
       // Connection = ConexaoDAO.getConnection();

         
    }
    
}
