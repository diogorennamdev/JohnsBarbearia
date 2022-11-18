package CONTROLS;

import DTO.UsuarioDTO;
import DAO.UsuarioDAO;
import Exceptions.NaoFoiPossivelAutenticaUsuarioException;
import Exceptions.NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException;
import HELPERS.Criptografia;
import HELPERS.Validacoes;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControlTelaLoginTest {

    UsuarioDAO usuariodao = new UsuarioDAO();
    UsuarioDTO usuariodto = new UsuarioDTO();

    private static final String SENHA = "12345";
    private static final String NAME = "Diogo";
    private static final String CPF = "45184311203";

    public ControlTelaLoginTest() {
    }

    @Before
    public void setUp() {
        CriarUsuario();
    }

    @Test
    public void TesteParaVerificarSeEstarEntrandoNoSistema() throws NaoFoiPossivelAutenticaUsuarioException, NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException {

        String Cpf = usuariodto.getCPF_usuario(),senha = usuariodto.getSenha_usuario();
        
        boolean logar = ControlTelaLogin.entrarSistema(Cpf, senha);

        assertTrue(logar);

    }

    @Test
    public void TesteparaVerificarValidarDadosDoLogin() throws NaoFoiPossivelAutenticaUsuarioException, NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException {
        assertTrue(ControlTelaLogin.validarDadosLogin(CPF, SENHA));

    }

    @Test
    public void DeveRetornarMensagemDeErroCasoOsCamposNãoSejamPreenchidos() throws NaoFoiPossivelAutenticaUsuarioException, NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException {
        String CPF_usuario = "";
        String senha_usuario = "";
        ControlTelaLogin.validarDadosLogin(CPF_usuario, senha_usuario); 

    }

    private void CriarUsuario() {
        usuariodto = new UsuarioDTO(CPF, NAME,
                SENHA);

    }
}
