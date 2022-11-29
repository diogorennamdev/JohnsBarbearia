package HELPERS.UNIT;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import EXCEPTIONS.ErroAoCriptografaSenhaException;
import EXCEPTIONS.ErroAoValidarCPFException;
import EXCEPTIONS.NaoFoiPossivelCadastrarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBDException;
import HELPERS.Criptografia;
import HELPERS.Validacoes;
import java.sql.SQLException;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidacoesTest {

    UsuarioDTO usuariodto = new UsuarioDTO();

    public ValidacoesTest() {
    }

    @Test
    public void TesteParaValidarCPF() throws ErroAoValidarCPFException {
        String cpf_valido = "45184311203";
        assertEquals(true, Validacoes.validarCPF(cpf_valido));
    }

    @Test
    public void DeveRetornarFalsoQuandoCpfForInvalido() throws ErroAoValidarCPFException {
        String Cpf = "25636545789";
        assertEquals(false, Validacoes.validarCPF(Cpf));
    }

    @Test
    public void TesteParaVericarCriptografiaDaSenha()
            throws NaoFoiPossivelCadastrarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            SQLException,
            ErroAoCriptografaSenhaException {

        String senha = "123";
        String senha_criptografada = Criptografia.criptografiaDaSenha(senha);
        assertEquals("959e8cmla530336a9mm65db9447753c64bb73fbli5fdeil7hl47nlhb", senha_criptografada);
    }

    @Test
    public void DeveRetornarMensagemDeErroAoTentarCriptografaSenhaSemOMetodo()
            throws NaoFoiPossivelCadastrarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            SQLException {
        String senha = "zaqwsxDEFRT3246718@RFSRJUUSHHSFRTxdcdfftghjjjhRF"
                + "SRJUUSHHSFRTxdcdfftghjjjhRFSRJUUSHHSFRTxdcdfftghjjjhR"
                + "zaqwsxDEFRT3246718@RFSRJUUSHHSFRTxdcdfftghjjjhRF12345"
                + "FSRJUUSHHSFRTxdcdfftghjjjhRFSRJUUSHHSFRTxdcdfftghjjjh"
                + "RFSRJUUSHHSFRTxdcdfftghjjjhRFSRJUUSHHSFRTxdcdfftghjjj"
                + "hRFSRJUUSHHSFRTxdcdfftghjjjh@rrttyyywywywywywyywyw";
        UsuarioDAO usuario = new UsuarioDAO();

        usuariodto = new UsuarioDTO("54376278912", "Carlos", senha);
        usuario.CadastrarUsuario(usuariodto);
        ErroAoCriptografaSenhaException exception = assertThrows(ErroAoCriptografaSenhaException.class,
                () -> Criptografia.criptografiaDaSenha(senha));
        assertEquals("Erro ao validar criptografa senha", exception.getMessage());
    }

    @Test
    public void Test() throws ErroAoCriptografaSenhaException { 
        String Senha = " ";
        String senha = "zaqwsxDEFRT3246718@RFSRJUUSHHSFRTxdcdfftghjjjhRF"
                + "SRJUUSHHSFRTxdcdfftghjjjhRFSRJUUSHHSFRTxdcdfftghjjjhR"
                + "zaqwsxDEFRT3246718@RFSRJUUSHHSFRTxdcdfftghjjjhRF12345"
                + "FSRJUUSHHSFRTxdcdfftghjjjhRFSRJUUSHHSFRTxdcdfftghjjjh"
                + "RFSRJUUSHHSFRTxdcdfftghjjjhRFSRJUUSHHSFRTxdcdfftghjjj"
                + "hRFSRJUUSHHSFRTxdcdfftghjjjh@rrttyyywywywywywyywyw";
        String formato_errado = Criptografia.criptografiaDaSenha(Senha);
        assertEquals("Erro ao validar criptografa senha", formato_errado);

    }
}
