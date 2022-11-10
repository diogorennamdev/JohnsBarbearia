
package HELPERS;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ValidacoesTest {
   
    public ValidacoesTest() {
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
    public void testValidarCPF() {
        String cpf = "86461154027";
        assertEquals(true, Validacoes.validarCPF(cpf));
    }

     @Test
    public void testCriptografiaDaSenha() {
        String senha = "123";
         assertEquals(Criptografia.criptografiaDaSenha(senha)
                 ,Criptografia.criptografiaDaSenha(senha));
    }
    
}