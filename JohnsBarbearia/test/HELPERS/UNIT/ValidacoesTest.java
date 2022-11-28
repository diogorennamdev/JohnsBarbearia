package HELPERS.UNIT;

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

    @AfterClass
    public static void tearDownClass() {
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

        String CPF = "6144827100", nome = "Pedro", senha = "1234";
        usuariodto = new UsuarioDTO(CPF, nome,
                Criptografia.criptografiaDaSenha(senha));
        assertEquals(Criptografia.criptografiaDaSenha(senha),
                usuariodto.getSenha_usuario());
    }

    @Test
    public void DeveRetornarMensagemDeErroAoTentarCriptografaSenhaSemOMetodo() {
        String senha = "123";
        ErroAoCriptografaSenhaException exception = assertThrows(ErroAoCriptografaSenhaException.class,
                () -> Criptografia.criptografiaDaSenha(senha));
        assertEquals("Erro ao validar criptografa senha", exception.getMessage());
    }
}
