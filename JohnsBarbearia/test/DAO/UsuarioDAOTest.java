package DAO;

import DTO.UsuarioDTO;
import HELPERS.Criptografia;
import HELPERS.Validacoes;
import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioDAOTest {

    private static final String SENHA = "12345";
    private static final String NAME = "Diogo";
    private static final String CPF = "45184311203";

    private UsuarioDTO usuario = new UsuarioDTO();
    private UsuarioDAO usuariodao = new UsuarioDAO();

    public UsuarioDAOTest() {
    }

    @Before
    public void setUp() {
        startUser();

    }

    @Test
    public void TestParaVerificarAutenticacaoDoUsuario() {
        assertTrue(usuariodao.autenticacaoUsuario(usuario));

    }

    @Test
    public void TesteParaVerificarSeEstarCadastrandoUsuario() {
        assertTrue(Validacoes.validarCPF(CPF));
        usuariodao.CadastrarUsuario(usuario);


    }

    @Test
    public void TesteParaVerificarSeEstarInserindosenhaCriptografada() {
        assertEquals(Criptografia.criptografiaDaSenha(SENHA),
                usuario.getSenha_usuario());
    }

    @Test
    public void TesteParaVerificarSeEstarEnviandoMensagemDeErroNoCadastro() {
        assertThrows(SQLException.class, ()
                -> usuariodao.CadastrarUsuario(usuario));

        
    }

    private void startUser() {
        usuario = new UsuarioDTO(CPF, NAME,
              Criptografia.criptografiaDaSenha(SENHA));

    }

}
