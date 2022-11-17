package DAO;

import DTO.UsuarioDTO;
import Exceptions.ErroAoValidarCpfException;
import Exceptions.NaoFoiPossivelAutenticaUsuarioException;
import Exceptions.NaoFoiPossivelCadastrarUsuarioException;
import Exceptions.NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException;
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
        CriarUsuario();

    }

    @Test
    public void TesteParaVerificarAutenticacaoDoUsuario() throws NaoFoiPossivelAutenticaUsuarioException, NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException {
        assertTrue(usuariodao.autenticacaoUsuario(usuario));

    }

    @Test
    public void TesteParaVerifcarSeRetornaErroCasoUsuarioNaoExista() throws NaoFoiPossivelAutenticaUsuarioException{
        NaoFoiPossivelAutenticaUsuarioException NaoFoiPossivelAutenticaUsuarioException
                = assertThrows(NaoFoiPossivelAutenticaUsuarioException.class,
                        ()-> usuariodao.autenticacaoUsuario(usuario));

        assertEquals("Usuario não Cadastrado no sistema!", NaoFoiPossivelAutenticaUsuarioException.getMessage());
    }

    @Test
    public void TesteParaVerificarSeEstarCadastrandoUsuario() throws NaoFoiPossivelCadastrarUsuarioException, ErroAoValidarCpfException, NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException {
        assertTrue(Validacoes.validarCPF(CPF));
        usuariodao.CadastrarUsuario(usuario);

    }

    @Test
    public void DeverRetornarMensagemDeErroNoCadastro() {
        NaoFoiPossivelCadastrarUsuarioException NaoFoiPossivelCadastrarUsuarioException
                = assertThrows(NaoFoiPossivelCadastrarUsuarioException.class,
                        () -> usuariodao.CadastrarUsuario(usuario));

        assertEquals("Usuario não Cadastrado", NaoFoiPossivelCadastrarUsuarioException.getMessage());
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
