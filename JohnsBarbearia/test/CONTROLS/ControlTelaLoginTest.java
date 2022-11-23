package CONTROLS;

import DTO.UsuarioDTO;
import EXCEPTIONS.NaoFoiPossivelAutenticaUsuario;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBD;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControlTelaLoginTest {

   
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
    public void TesteParaVerificarSeEstarEntrandoNoSistema() 
            throws NaoFoiPossivelAutenticaUsuario, 
            NaoFoiPossivelEstabelecerConexaoComBD {

        String Cpf = usuariodto.getCPF_usuario(),senha 
                = usuariodto.getSenha_usuario();
        
        boolean logar = ControlTelaLogin.entrarSistema(Cpf, senha);
        assertTrue(logar);

    }

<<<<<<< HEAD
//    @Test
//    public void TesteparaVerificarValidarDadosDoLogin() 
//            throws NaoFoiPossivelAutenticaUsuario, 
//            NaoFoiPossivelEstabelecerConexaoComBD {
//        
//        assertTrue(ControlTelaLogin.validarDadosLogin(CPF, SENHA));
//
//    }
=======
    @Test
    public void TesteparaVerificarValidarDadosDoLogin() 
            throws NaoFoiPossivelAutenticaUsuario, 
            NaoFoiPossivelEstabelecerConexaoComBD {
        
      //  assertTrue(ControlTelaLogin.validarDadosLogin(CPF, SENHA));

    }
>>>>>>> 72c9172e9196418aaa9840b1170747bbe79c60c9

    @Test
    public void DeveRetornarMensagemDeErroCasoOsCamposNãoSejamPreenchidos() 
            throws NaoFoiPossivelAutenticaUsuario, 
            NaoFoiPossivelEstabelecerConexaoComBD {
        
        String CPF_usuario = "";
        String senha_usuario = "";
        ControlTelaLogin.validarDadosLogin(CPF_usuario, senha_usuario); 

    }

    private void CriarUsuario() {
        usuariodto = new UsuarioDTO(CPF, NAME,
                SENHA);

    }
}
