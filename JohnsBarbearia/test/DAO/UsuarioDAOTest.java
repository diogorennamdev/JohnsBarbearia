package DAO;

import DTO.UsuarioDTO;
import DAO.UsuarioDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class UsuarioDAOTest {

    private static final String SENHA = "1234";
    private static final String EMAIL = "diogo@gmail.com";
    private static final String NAME = "Diogo";
    private static final String CPF = "0124789";

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
        assertNotNull(usuario);
        assertEquals(EMAIL, usuario.getEmail_usuario());
        assertEquals(SENHA,usuario.getSenha_usuario());
    }

    @Test
    public void TesteCadastrarUsuario() {
        usuariodao.CadastrarUsuario(usuario);
   
        assertEquals(CPF, usuario.getCPF_usuario());
        assertEquals(NAME, usuario.getNome_usuario());
        assertEquals(EMAIL, usuario.getEmail_usuario());
        assertEquals(SENHA, usuario.getSenha_usuario());

    }

    private void startUser() {
        usuario = new UsuarioDTO(CPF, NAME,
                EMAIL, SENHA);

    }

}
