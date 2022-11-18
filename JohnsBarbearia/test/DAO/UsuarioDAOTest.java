package DAO;

import DTO.UsuarioDTO;
import EXCEPTIONS.ErroAoValidarCPF;
import EXCEPTIONS.NaoFoiPossivelAutenticaUsuario;
import EXCEPTIONS.NaoFoiPossivelCadastrarUsuario;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBD;
import HELPERS.Criptografia;
import HELPERS.Validacoes;
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
        CriarUsuario();

    }

    @Test
    public void TesteParaVerificarSeEstarCadastrandoUsuario()
            throws NaoFoiPossivelCadastrarUsuario,
            ErroAoValidarCPF,
            NaoFoiPossivelEstabelecerConexaoComBD {
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
            throws NaoFoiPossivelAutenticaUsuario,
            NaoFoiPossivelEstabelecerConexaoComBD {
        boolean autenticarUsuario
                = usuariodao.autenticacaoUsuario(usuario);
        assertTrue(autenticarUsuario);
        // assertEquals(true, usuariodao.autenticacaoUsuario(usuario));

    }

    @Test
    public void TesteParaVerifcarSeRetornaErroCasoUsuarioNaoExista()
            throws NaoFoiPossivelAutenticaUsuario {
        NaoFoiPossivelAutenticaUsuario NaoFoiPossivelAutenticaUsuario
                = assertThrows(NaoFoiPossivelAutenticaUsuarioException.class,
                        () -> usuariodao.autenticacaoUsuario(usuario));

        assertEquals("Usuario não Cadastrado no sistema!",
                NaoFoiPossivelAutenticaUsuario.getMessage());
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
