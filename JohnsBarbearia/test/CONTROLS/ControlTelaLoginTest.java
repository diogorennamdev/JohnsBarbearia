package CONTROLS;

import DTO.UsuarioDTO;
import DAO.UsuarioDAO;
import Exceptions.NaoFoiPossivelAutenticaUsuarioException;
import HELPERS.Criptografia;
import HELPERS.Validacoes;
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
    public void TesteParaVerificarSeEstarEntrandoNoSistema() throws NaoFoiPossivelAutenticaUsuarioException {
        assertTrue(ControlTelaLogin.entrarSistema(CPF,
                SENHA));

    }

    @Test
    public void TesteparaVerificarValidarDadosDoLogin() throws NaoFoiPossivelAutenticaUsuarioException {
        assertTrue(ControlTelaLogin.validarDadosLogin(CPF, SENHA));
        
        
    }
    @Test
    public void DeveRetornarMensagemDeErroCasoOsCamposNãoSejamPreenchidos() throws NaoFoiPossivelAutenticaUsuarioException{
        String CPF_usuario = "";
        String senha_usuario = "";
        ControlTelaLogin.validarDadosLogin(CPF_usuario, senha_usuario);
        
        
    }
    private void CriarUsuario() {
        usuariodto = new UsuarioDTO(CPF, NAME,
                Criptografia.criptografiaDaSenha(SENHA));

    }
}
