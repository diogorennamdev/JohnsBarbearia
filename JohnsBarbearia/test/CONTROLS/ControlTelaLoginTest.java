package CONTROLS;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import EXCEPTIONS.ErroAoCriptografaSenhaException;
import EXCEPTIONS.NaoFoiPossivelAutenticarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelCadastrarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBDException;
import HELPERS.Criptografia;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControlTelaLoginTest {

   
    UsuarioDAO usuariodao = new UsuarioDAO();
    private static final String SENHA = "12345";
    private static final String NAME = "Diogo";
    private static final String CPF = "25442606022";

    public ControlTelaLoginTest() {
    }

    @Test
    public void TesteParaVerificarSeEstarEntrandoNoSistema()
            throws 
            NaoFoiPossivelEstabelecerConexaoComBDException,
            NaoFoiPossivelCadastrarUsuarioException,
            SQLException,
            ErroAoCriptografaSenhaException,
            NaoFoiPossivelAutenticarUsuarioException {

        UsuarioDTO usuario = new UsuarioDTO(CPF, NAME,
                Criptografia.criptografiaDaSenha(SENHA));

        usuariodao.CadastrarUsuario(usuario);
        assertTrue(ControlTelaLogin.entrarSistema(CPF, SENHA));

    }

    @Test
    public void DeveRetornarMensagemQuandoOsCamposNaoForemPreenchidos()
            throws NaoFoiPossivelAutenticarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoCriptografaSenhaException {

        String Cpf = "", senha = "";
        String campos_vazios = ControlTelaLogin.validarDadosLogin(Cpf, senha);
        assertEquals("CAMPOS VAZIOS!\n Por favor insira os dados.", campos_vazios);
    }

    @Test
    public void DeverRetornarMensagemQuandoUsuarioNaoEstarCadastradoNoSistema()
            throws NaoFoiPossivelAutenticarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoCriptografaSenhaException { 
        
        NaoFoiPossivelAutenticarUsuarioException exception = assertThrows(NaoFoiPossivelAutenticarUsuarioException.class,
                ()-> ControlTelaLogin.validarDadosLogin(CPF, SENHA));
       assertEquals("Usuario não Cadastrado no sistema!", exception.getMessage());
    }
   
}
