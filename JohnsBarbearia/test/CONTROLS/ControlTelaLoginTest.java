package CONTROLS;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import EXCEPTIONS.NaoFoiPossivelAutenticarUsuario;
import EXCEPTIONS.NaoFoiPossivelCadastrarUsuario;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBD;
import HELPERS.Criptografia;
import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControlTelaLoginTest {

    UsuarioDTO usuariodto = new UsuarioDTO();
    UsuarioDAO usuariodao = new UsuarioDAO();
    private static final String SENHA = "12345";
    private static final String NAME = "Diogo";
    private static final String CPF = "45184311203";

    public ControlTelaLoginTest() {
    }

    @Before
    public void setUp() {
        //  CriarUsuario();
    }

    @Test
    public void TesteParaVerificarSeEstarEntrandoNoSistema()
            throws NaoFoiPossivelAutenticarUsuario,
            NaoFoiPossivelEstabelecerConexaoComBD,
            NaoFoiPossivelCadastrarUsuario,
            SQLException {

        UsuarioDTO usuario = new UsuarioDTO(CPF, NAME,
                Criptografia.criptografiaDaSenha(SENHA));

        usuariodao.CadastrarUsuario(usuario);
        assertTrue(ControlTelaLogin.entrarSistema(CPF,SENHA));
        
        

    }

    @Test
    public void TesteparaVerificarValidarDadosDoLogin()
            throws NaoFoiPossivelAutenticarUsuario,
            NaoFoiPossivelEstabelecerConexaoComBD {

        //  assertTrue(ControlTelaLogin.validarDadosLogin(CPF, SENHA));
    }

    @Test
    public void DeveRetornarMensagemDeErroCasoOsCamposNãoSejamPreenchidos()
            throws NaoFoiPossivelAutenticarUsuario,
            NaoFoiPossivelEstabelecerConexaoComBD {

        String CPF_usuario = "";
        String senha_usuario = "";
        ControlTelaLogin.validarDadosLogin(CPF_usuario, senha_usuario);

    }

}
