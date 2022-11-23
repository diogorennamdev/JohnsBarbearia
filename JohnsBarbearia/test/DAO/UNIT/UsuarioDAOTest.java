package DAO.UNIT;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import EXCEPTIONS.ErroAoValidarCPF;
import EXCEPTIONS.NaoFoiPossivelAutenticarUsuario;
import EXCEPTIONS.NaoFoiPossivelCadastrarUsuario;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBD;
import HELPERS.Criptografia;
import HELPERS.Validacoes;
import java.sql.SQLException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

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
        CriarUsuario();

    }

    @Test
    public void TesteParaVerificarSeEstarCadastrandoUsuario()
            throws NaoFoiPossivelCadastrarUsuario,
            ErroAoValidarCPF,
            NaoFoiPossivelEstabelecerConexaoComBD,
            SQLException {
        assertTrue(Validacoes.validarCPF(CPF));
        usuariodao.CadastrarUsuario(usuario);
        assertEquals(UsuarioDTO.class, usuario.getClass());

    }

    @Test
    public void DeverRetornarMensagemDeErroNoCadastro() {
        NaoFoiPossivelCadastrarUsuario NaoFoiPossivelCadastrarUsuario
                = assertThrows(NaoFoiPossivelCadastrarUsuario.class,
                        () -> usuariodao.CadastrarUsuario(usuario));

        assertEquals("Usuario não Cadastrado",
                NaoFoiPossivelCadastrarUsuario.getMessage());
    }

    @Test
    public void TesteParaVerificarAutenticacaoDoUsuario()
            throws NaoFoiPossivelAutenticarUsuario,
            NaoFoiPossivelEstabelecerConexaoComBD {
        boolean autenticarUsuario
                = usuariodao.autenticacaoUsuario(usuario);
        assertTrue(autenticarUsuario);

    }

    @Test
    public void TesteParaVerifcarSeRetornaErroCasoUsuarioNaoExista()
            throws NaoFoiPossivelAutenticarUsuario {
        NaoFoiPossivelAutenticarUsuario exception
                = assertThrows(NaoFoiPossivelAutenticarUsuario.class,
                        () -> usuariodao.autenticacaoUsuario(usuario));

        assertEquals("não foi possivel cadastrar usuario",
                exception.getMessage());
    }

    @Test
    public void TesteParaVerificarSeEstarInserindosenhaCriptografada() {
        assertEquals(Criptografia.criptografiaDaSenha(SENHA),
                usuario.getSenha_usuario());
    }

    private void CriarUsuario() {
        usuario = new UsuarioDTO(CPF, NAME,
                Criptografia.criptografiaDaSenha(SENHA));

    }

}
