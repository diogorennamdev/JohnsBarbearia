package DAO.UNIT;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import EXCEPTIONS.ErroAoCriptografaSenhaException;
import EXCEPTIONS.ErroAoValidarCPFException;
import EXCEPTIONS.NaoFoiPossivelAutenticarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelCadastrarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBDException;
import HELPERS.Criptografia;
import HELPERS.Validacoes;
import java.sql.SQLException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class UsuarioDAOTest {

    private static final String CPF = "45184311203";
    private static final String NOME = "Igor";
    private static final String SENHA = "1234";

    private UsuarioDTO usuario = new UsuarioDTO();
    private UsuarioDAO usuariodao = new UsuarioDAO();

    public UsuarioDAOTest() {
    }

    private void CriarUsuario() throws ErroAoCriptografaSenhaException {
        usuario = new UsuarioDTO(CPF, NOME,
                Criptografia.criptografiaDaSenha(SENHA));

    }

    @Before
    public void setUp()
            throws NaoFoiPossivelCadastrarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            SQLException, ErroAoCriptografaSenhaException {
        
        CriarUsuario();
      
    }

    @Test
    public void TesteParaVerificarSeEstarCadastrandoUsuario()
            throws NaoFoiPossivelCadastrarUsuarioException,
            ErroAoValidarCPFException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            SQLException, 
            ErroAoCriptografaSenhaException { 
       // String Cpf = "45184311203", nome = "igor", senha ="1234";
        UsuarioDTO novo_usuario = new UsuarioDTO(CPF, NOME,
                Criptografia.criptografiaDaSenha(SENHA));
        assertTrue(Validacoes.validarCPF(CPF));
        usuariodao.CadastrarUsuario(novo_usuario);
        assertEquals(UsuarioDTO.class, novo_usuario.getClass());

    }

    @Test
    public void DeverRetornarMensagemDeErroNoCadastroQuandoUsuarioJaExiste() 
            throws ErroAoCriptografaSenhaException {
        UsuarioDTO usuario_existente = new UsuarioDTO("45184311203", "Igor",
                Criptografia.criptografiaDaSenha("1234"));
        NaoFoiPossivelCadastrarUsuarioException NaoFoiPossivelCadastrarUsuario
                = assertThrows(NaoFoiPossivelCadastrarUsuarioException.class,
                        () -> usuariodao.CadastrarUsuario(usuario_existente));

        assertEquals("Usuario não Cadastrado",
                NaoFoiPossivelCadastrarUsuario.getMessage());
    }

    @Test
    public void TesteParaVerificarAutenticacaoDoUsuario()
            throws NaoFoiPossivelAutenticarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException {
        boolean autenticarUsuario
                = usuariodao.autenticacaoUsuario(usuario);
        assertTrue(autenticarUsuario);

    }

    @Test
    public void TesteParaVerifcarSeRetornaErroCasoUsuarioNaoExista()
            throws NaoFoiPossivelAutenticarUsuarioException {
        UsuarioDTO usuario_invalido = new UsuarioDTO("45678945123", "Diogo", "1234");

        NaoFoiPossivelAutenticarUsuarioException exception
                = assertThrows(NaoFoiPossivelAutenticarUsuarioException.class,
                        () -> usuariodao.autenticacaoUsuario(usuario_invalido));

        assertEquals("Usuario não Cadastrado no sistema!",
                exception.getMessage());
    }

    @Test
    public void TesteParaVerificarSeEstarInserindosenhaCriptografada()
            throws ErroAoCriptografaSenhaException {
        assertEquals(Criptografia.criptografiaDaSenha(SENHA),
                usuario.getSenha_usuario());
    } 
    
   
}
