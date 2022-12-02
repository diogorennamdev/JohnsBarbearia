package CONTROLS;

import EXCEPTIONS.ErroAoCriptografaSenhaException;
import EXCEPTIONS.ErroAoValidarCPFException;
import EXCEPTIONS.ErroAoValidarDadosExecption;
import EXCEPTIONS.NaoFoiPossivelAutenticarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelCadastrarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBDException;
import java.sql.SQLException;
import org.junit.Assert;
import org.junit.Test;

public class ControlTelaCadastroTest {

    public ControlTelaCadastroTest() {
    }

    @Test
    public void TesteParaCadastrarUsuarioNoBanco()
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoValidarCPFException,
            ErroAoValidarDadosExecption,
            NaoFoiPossivelCadastrarUsuarioException,
            SQLException,
            NaoFoiPossivelAutenticarUsuarioException,
            ErroAoCriptografaSenhaException {

        String Cpf = "15027412886", nome = "Gustavo", senha = "1234";
        boolean novo_usuario = ControlTelaCadastro.Cadastrar(Cpf, nome, senha);
        Assert.assertEquals(true, novo_usuario);
    }

    @Test
    public void DeverMostrarMesagemPedindoParaOUsuarioInserirOsDadosCasoDeixeCamposVazios()
            throws ErroAoValidarDadosExecption,
            NaoFoiPossivelCadastrarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            SQLException, ErroAoValidarCPFException,
            ErroAoCriptografaSenhaException,
            NaoFoiPossivelAutenticarUsuarioException {

        String Cpf = "", nome = "", senha = "";
        String mensagemCampoVazio
                = ControlTelaCadastro.AutenticaDados(Cpf, nome, senha);
        Assert.assertEquals("CAMPOS VAZIOS!\n Por favor insira os dados",
                mensagemCampoVazio);
    }

    @Test
    public void DeverRetonarMesagemQuandoUsuarioJaExisteNoSistema()
            throws ErroAoValidarDadosExecption,
            NaoFoiPossivelCadastrarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            SQLException, ErroAoValidarCPFException,
            NaoFoiPossivelAutenticarUsuarioException,
            ErroAoCriptografaSenhaException {

        String Cpf = "18342451330", nome = "usuarioTeste", senha = "1234";
        ControlTelaCadastro.Cadastrar(Cpf, nome, senha);
        String usuarioExistente
                = ControlTelaCadastro.AutenticaDados(Cpf, nome, senha);
        Assert.assertEquals("CPF JÁ CADASTRADO!\n Por favor tente novamente!",
                usuarioExistente);
    }

    @Test
    public void DeverRetornarMensagemQuandoCpfForInvalido()
            throws ErroAoValidarDadosExecption,
            NaoFoiPossivelCadastrarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            SQLException,
            ErroAoValidarCPFException,
            NaoFoiPossivelAutenticarUsuarioException,
            ErroAoCriptografaSenhaException {

        String Cpf = "15022886", nome = "Gustavo", senha = "1234";
        String CpfInvalido = ControlTelaCadastro.AutenticaDados(Cpf, nome, senha);
        Assert.assertEquals("ERRO, CPF INVÁLIDO!\n", CpfInvalido);
    }
}
