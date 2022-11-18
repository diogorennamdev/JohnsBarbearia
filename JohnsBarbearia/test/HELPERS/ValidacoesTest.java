package HELPERS;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import Exceptions.ErroAoValidarCpfException;
import Exceptions.NaoFoiPossivelCadastrarUsuarioException;
import Exceptions.NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException;
import static HELPERS.Validacoes.validarCPF;
import java.util.InputMismatchException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidacoesTest {

    UsuarioDAO usuariodao = new UsuarioDAO();
    UsuarioDTO usuariodto = new UsuarioDTO();

    public ValidacoesTest() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    @Test
    public void TesteParaValidarCPF() throws ErroAoValidarCpfException {
        String cpf = "45184311203";
        assertEquals(true, Validacoes.validarCPF(cpf));
    }

    @Test
    public void TestaParaVerificarSeEnviaMensagemDeErroCasoCpfEstejaErrado() {

        ErroAoValidarCpfException erroAoValidarCpf = assertThrows(ErroAoValidarCpfException.class,
                 () -> Validacoes.validarCPF("05280503"));

        assertEquals("Erro ao validar CPF", erroAoValidarCpf.getMessage());
    }

    @Test
    public void TesteParaVericarCriptografiaDaSenha() throws NaoFoiPossivelCadastrarUsuarioException, NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException {
        String CPF = "6144827100", nome = "Pedro",senha = "1234";

        usuariodto = new UsuarioDTO(CPF, nome,
                Criptografia.criptografiaDaSenha(senha));

        usuariodao.CadastrarUsuario(usuariodto);
       

        assertEquals(Criptografia.criptografiaDaSenha(senha),
                usuariodto.getSenha_usuario());
    }

}
