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
    public void TestParaValidarCPF() {
        String cpf = "45184311203";
        assertEquals(true, Validacoes.validarCPF(cpf));
    }

    @Test
    public void TestParaVericarCriptografiaDaSenha() {
        String senha = Criptografia.criptografiaDaSenha("1234");

        assertEquals(Criptografia.criptografiaDaSenha("1234"),
                 senha);
    }

}
