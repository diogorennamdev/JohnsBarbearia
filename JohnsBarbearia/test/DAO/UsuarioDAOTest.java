package DAO;

import CONTROLS.ControlTelaCadastro;
import DTO.UsuarioDTO;
import DAO.UsuarioDAO;
import HELPERS.Validacoes;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class UsuarioDAOTest {

    private static final String SENHA = "1234";
    private static final String EMAIL = "diogorenam@gmail";
    private static final String NAME = "Diogo";
    private static final String CPF = "05281720563";

    private UsuarioDTO usuario = new UsuarioDTO();
    private UsuarioDAO usuariodao = new UsuarioDAO();

    public UsuarioDAOTest() {
    }

    @AfterClass
    public static void tearDownClass() {

    }

    @Before
    public void setUp() {
        startUser();
       
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAutenticacaoUsuario() {
        usuariodao.autenticacaoUsuario(usuario);
        
        assertEquals("diogorenam@gmail", usuario.getEmail_usuario());
        assertEquals("1234",usuario.getSenha_usuario());
    }

    @Test
    public void TesteCadastrarUsuario() {
        
        if (Validacoes.validarCPF(CPF) == true) {
            usuariodao.CadastrarUsuario(usuario);
        }else{
            fail();
        }   
        
        assertEquals(CPF, usuario.getCPF_usuario());
        assertEquals("Diogo", usuario.getNome_usuario());
        assertEquals(EMAIL, usuario.getEmail_usuario());
        assertEquals("1234", usuario.getSenha_usuario());
    }

    private void startUser() {
        usuario = new UsuarioDTO(CPF, NAME,
                EMAIL, SENHA);
         
    }

}
