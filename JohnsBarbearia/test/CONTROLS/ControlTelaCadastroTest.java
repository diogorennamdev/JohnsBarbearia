package CONTROLS;


import EXCEPTIONS.ErroAoCriptografaSenhaException;
import EXCEPTIONS.ErroAoValidarCPFException;
import EXCEPTIONS.ErroAoValidarDadosExecption;
import EXCEPTIONS.NaoFoiPossivelAutenticarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelCadastrarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBDException;
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
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoValidarCPFException,
            ErroAoValidarDadosExecption,
            NaoFoiPossivelCadastrarUsuarioException,
            SQLException,
            NaoFoiPossivelAutenticarUsuarioException,
            ErroAoCriptografaSenhaException {

        String Cpf = "15027412886", nome = "Gustavo", senha = "1234";
        ControlTelaCadastro.cadastrar(Cpf, nome, senha);
        
       
        // select no banco para verificar se o usuario foi cadastrdo
    }

    @Test
    public void DeverMostrarJOptionPaneQuandoCpfForInseridoDuasVezes()
            throws ErroAoValidarDadosExecption,
            NaoFoiPossivelCadastrarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            SQLException,
            ErroAoValidarCPFException,
            NaoFoiPossivelAutenticarUsuarioException,
            ErroAoCriptografaSenhaException {
        
        String Cpf = "96575718205", nome = "Paulo", senha = "1234";
        ControlTelaCadastro.autenticaDados(Cpf, nome, senha);
    }
}
