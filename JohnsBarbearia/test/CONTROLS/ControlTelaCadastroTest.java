package CONTROLS;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import Exceptions.ErroAoValidarCpfException;
import Exceptions.ErroAoValidarDadosException;
import Exceptions.NaoFoiPossivelCadastrarUsuarioException;
import Exceptions.NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException;
import HELPERS.Validacoes;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControlTelaCadastroTest {

    UsuarioDAO usuariodao = new UsuarioDAO();
    UsuarioDTO usuariodto = new UsuarioDTO();

    public ControlTelaCadastroTest() {
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
    public void TesteParaVerificardadosNoBanco() throws NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException, ErroAoValidarCpfException, ErroAoValidarDadosException, NaoFoiPossivelCadastrarUsuarioException {
        String Cpf ="96575718205", nome = "Gustavo", senha = "1234";
        
        ControlTelaCadastro.cadastrar(Cpf, nome, senha);
        //String Cpf = "96575718205", nome = "Paulo", senha = "1234";
        

       // assertEquals(true, ControlTelaCadastro.ValidarDadosCPF(Cpf, nome, senha));
    }

    @Test
    public void DeverMostrarJOptionPaneQuandoCpfForInseridoDuasVezes() throws ErroAoValidarDadosException, NaoFoiPossivelCadastrarUsuarioException, NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException {
        String Cpf = "96575718205", nome = "Paulo", senha = "1234";
        ControlTelaCadastro.autenticaDadosBD(Cpf, nome, senha);
    }
}
