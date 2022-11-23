package CONTROLS;


import EXCEPTIONS.ErroAoValidarCPF;
import EXCEPTIONS.ErroAoValidarDados;
import EXCEPTIONS.NaoFoiPossivelAutenticarUsuario;
import EXCEPTIONS.NaoFoiPossivelCadastrarUsuario;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBD;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class ControlTelaCadastroTest {

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
    public void TesteParaVerificarDadosNoBanco()
            throws NaoFoiPossivelEstabelecerConexaoComBD,
            ErroAoValidarCPF,
            ErroAoValidarDados,
            NaoFoiPossivelCadastrarUsuario,
            SQLException,
            NaoFoiPossivelAutenticarUsuario {

        String Cpf = "15027412886", nome = "Gustavo", senha = "1234";
        ControlTelaCadastro.cadastrar(Cpf, nome, senha);
        
       
        // select no banco para verificar se o usuario foi cadastrdo
    }

    @Test
    public void DeverMostrarJOptionPaneQuandoCpfForInseridoDuasVezes()
            throws ErroAoValidarDados,
            NaoFoiPossivelCadastrarUsuario,
            NaoFoiPossivelEstabelecerConexaoComBD,
            SQLException,
            ErroAoValidarCPF,
            NaoFoiPossivelAutenticarUsuario {
        
        String Cpf = "96575718205", nome = "Paulo", senha = "1234";
        ControlTelaCadastro.autenticaDados(Cpf, nome, senha);
    }
}
