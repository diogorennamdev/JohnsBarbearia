package HELPERS;

import Exceptions.ErroAoValidarCpfException;
import static HELPERS.Validacoes.validarCPF;
import java.util.InputMismatchException;
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
    public void TesteParaValidarCPF() throws ErroAoValidarCpfException {
        String cpf = "45184311203";
        assertEquals(true, Validacoes.validarCPF(cpf));
    }
//    @Test
//    public void TestaParaVerificarSeEnviaMensagemDeErroCasoCpfEstejaErrado(){ 
//        
//        ErroAoValidarCpfException erroAoValidarCpf = assertThrows(ErroAoValidarCpfException.class
//                , () -> Validacoes.validarCPF("05281720503"));
//        
//        assertEquals("Erro ao validar CPF", erroAoValidarCpf.getMessage());
//    }
    
    @Test
    public void TesteParaVericarCriptografiaDaSenha() {
        String senha = Criptografia.criptografiaDaSenha("1234");

        assertEquals(Criptografia.criptografiaDaSenha("1234"),
                 senha);
    }

}
