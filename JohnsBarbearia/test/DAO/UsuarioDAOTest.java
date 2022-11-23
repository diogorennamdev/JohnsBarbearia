package DAO;

import DTO.UsuarioDTO;
import EXCEPTIONS.ErroAoValidarCPF;
import EXCEPTIONS.ErroAoValidarDados;
import EXCEPTIONS.NaoFoiPossivelAutenticaUsuario;
import EXCEPTIONS.NaoFoiPossivelCadastrarUsuario;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBD;
import java.sql.SQLException;
import static org.mockito.Mockito.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioDAOTest {

    private final UsuarioDAO usuariodao = mock(UsuarioDAO.class);

    @Test
    public void TesteParaVerificarAutenticacaoDoUsuario()
            throws NaoFoiPossivelAutenticaUsuario,
            NaoFoiPossivelEstabelecerConexaoComBD,
            ErroAoValidarCPF {

        UsuarioDTO usuario = new UsuarioDTO("85412145478",
                "Diogo", "1234");
        when(usuariodao.autenticacaoUsuario(usuario)).thenReturn(true);
        assertTrue(usuariodao.autenticacaoUsuario(usuario));
        verify(usuariodao, times(1)).autenticacaoUsuario(usuario);
    }

    @Test
    public void DeverRetornaFalseCasoOUsuarioNaoExistaNoBanco()
            throws NaoFoiPossivelAutenticaUsuario,
            NaoFoiPossivelEstabelecerConexaoComBD,
            ErroAoValidarCPF {

        UsuarioDTO usuario = new UsuarioDTO("85412145478",
                "Diogo", "1234");
        when(usuariodao.autenticacaoUsuario(
                usuario)).thenReturn(false);
        assertFalse(usuariodao.autenticacaoUsuario(usuario));
        verify(usuariodao, times(1)
        ).autenticacaoUsuario(usuario);
    }

    @Test
    public void TesteParaVerificarSeEstarInserindoUsuario() throws
            NaoFoiPossivelCadastrarUsuario,
            NaoFoiPossivelEstabelecerConexaoComBD,
            SQLException {

        UsuarioDTO usuario = new UsuarioDTO("50623842904",
                "Diogo", "1234");
        doNothing().when(usuariodao).CadastrarUsuario(usuario);
        usuariodao.CadastrarUsuario(usuario);
        verify(usuariodao, times(1))
                .CadastrarUsuario(usuario);

    }

    @Test
    public void TesteParaVerificarValidacaoDedados()
            throws ErroAoValidarDados,
            NaoFoiPossivelEstabelecerConexaoComBD {
        
        UsuarioDTO usuario = new UsuarioDTO("345540503", "diogo", "1234");
        when(usuariodao.verificarDadosBDCpf(usuario)).thenReturn(true);
        assertTrue(usuariodao.verificarDadosBDCpf(usuario));
        verify(usuariodao, times(1)).verificarDadosBDCpf(usuario);
    }

    @Test
    public void TesteParaverificarValidacaoDeDadosFalse()
            throws ErroAoValidarDados,
            NaoFoiPossivelEstabelecerConexaoComBD {
        
        UsuarioDTO usuario = new UsuarioDTO("345540503", "diogo", "1234");
        when(usuariodao.verificarDadosBDCpf(usuario)).thenReturn(false);
        assertFalse(usuariodao.verificarDadosBDCpf(usuario));
        verify(usuariodao, times(1)).verificarDadosBDCpf(usuario);
    }

    /*  private static final String SENHA = "12345";
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
        
    }

    @Test
    public void TesteParaVerifcarSeRetornaErroCasoUsuarioNaoExista()
            throws NaoFoiPossivelAutenticaUsuario {
        NaoFoiPossivelAutenticaUsuario naoFoiPossivelAutenticaUsuario
                = assertThrows(NaoFoiPossivelAutenticaUsuario.class,
                        () -> usuariodao.autenticacaoUsuario(usuario));

        assertEquals("não foi possivel cadastrar usuario",
                naoFoiPossivelAutenticaUsuario.getMessage());
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
     */
}
