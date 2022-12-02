package DAO;

import EXCEPTIONS.NaoFoiPossivelCadastrarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBDException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

public class ConexaoDAOTest {

    @Mock
    private ConexaoDAO conexaodao;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void TesteParaVerificarSeOBancoEstarConectado()
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            SQLException {

        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/JohnsBarbearia?serverTimezone=UTC";
        String usuario = "root";
        String senha = "";
        conn = DriverManager.getConnection(url, usuario, senha);
        Assert.assertNotNull(conn);

    }

    @Test
    public void VerificarSelancaErroQuandoUsuarioTentaFazerAlgumaAcaoComBancoIndisponivel()
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            NaoFoiPossivelCadastrarUsuarioException,
            SQLException {

        when(conexaodao.conectaBD())
                .thenThrow(new NaoFoiPossivelEstabelecerConexaoComBDException());
        NaoFoiPossivelEstabelecerConexaoComBDException exception
                = Assert.assertThrows(NaoFoiPossivelEstabelecerConexaoComBDException.class,
                        () -> conexaodao.conectaBD());
        Assert.assertEquals("Não foi possivel realizar Conexão com o Banco de dados",
                exception.getMessage());
    }

}
