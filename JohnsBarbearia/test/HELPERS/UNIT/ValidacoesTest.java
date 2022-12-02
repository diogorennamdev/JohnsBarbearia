package HELPERS.UNIT;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import EXCEPTIONS.ErroAoCriptografaSenhaException;
import EXCEPTIONS.ErroAoValidarCPFException;
import EXCEPTIONS.NaoFoiPossivelCadastrarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBDException;
import HELPERS.Criptografia;
import HELPERS.Validacoes;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidacoesTest {

    //  UsuarioDTO usuariodto = new UsuarioDTO();
    public ValidacoesTest() {
    }

    @Test
    public void TesteParaValidarCPF() throws ErroAoValidarCPFException {
        String cpf_valido = "45184311203";
        assertEquals(true, Validacoes.validarCPF(cpf_valido));
    }

    @Test
    public void DeveRetornarFalsoQuandoCpfForInvalido()
            throws ErroAoValidarCPFException {

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
        assertEquals("196a500b9911174047387a15004a27a6661231b233a904b457a998568"
                + "33779928b67b2ab", senha_criptografada);
    }

    
}
