package DAO;

import DAO.AgendamentoDAO;
import DTO.AgendamentoDTO;
import EXCEPTIONS.ErroAoEditarAgendamentoException;
import EXCEPTIONS.ErroAoListarDadosException;
import EXCEPTIONS.ErroAoTentarExcluirAgendamentoException;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBDException;
import EXCEPTIONS.NaoFoiPossivelRealizarAgendamentoException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class AgendamentoDAOTest {

    private AgendamentoDAO agendamentodao = mock(AgendamentoDAO.class);

    @Before
    public void init() {

    }

    @Test
    public void TesteParaVerificarSeEstarInserindoAgendamento()
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            NaoFoiPossivelRealizarAgendamentoException, SQLException {

        AgendamentoDTO agendamento = new AgendamentoDTO(
                0, "diogo", "corte", "30",
                "22/12/2022", "10:00", "teste");
        doNothing().when(agendamentodao).Agendar(agendamento);
        agendamentodao.Agendar(agendamento);
        verify(agendamentodao, times(1)).Agendar(agendamento);
        Assert.assertEquals(AgendamentoDTO.class, agendamento.getClass());

    }

    @Test(expected = NaoFoiPossivelRealizarAgendamentoException.class)
    public void TesteParaVerificarMensagemDeErroAoinserirAgendamento()
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            NaoFoiPossivelRealizarAgendamentoException, SQLException {

        AgendamentoDTO agendamento = new AgendamentoDTO(1, "diogo", "corte", "30",
                "22/12/2022", "10:00", "teste");
        doThrow(new NaoFoiPossivelRealizarAgendamentoException())
                .when(agendamentodao).Agendar(agendamento);
        agendamentodao.Agendar(agendamento);

    }

    @Test
    public void TesteParaVerificarSeEstarListandoHorarios()
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoListarDadosException {

        List<AgendamentoDTO> ListarHorarios = new ArrayList();
        ListarHorarios.add(new AgendamentoDTO(1, "Diogo", "corte", "10",
                "28/11/2022", "20:00", "teste"));
        when(agendamentodao.ListarHorarios()).thenReturn(ListarHorarios);
        Assert.assertEquals(agendamentodao.ListarHorarios(), ListarHorarios);
    }

    @Test
    public void TesteParaVerificarSeLancaErroAoListarHorarios()
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoListarDadosException {

        List<AgendamentoDTO> ListarHorarios = new ArrayList();
        ListarHorarios.add(new AgendamentoDTO(1, "Diogo", "corte", "10",
                "28/11/2022", "20:00", "teste"));
        doThrow(new ErroAoListarDadosException()).when(agendamentodao).ListarHorarios();
        ErroAoListarDadosException exception
                = Assert.assertThrows(ErroAoListarDadosException.class,
                        () -> agendamentodao.ListarHorarios());
        Assert.assertEquals("Erro ao Listar Dados", exception.getMessage());
    }

    @Test
    public void TesteParaVerificarSeEstarAtualizandoAgendamento()
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            NaoFoiPossivelRealizarAgendamentoException, SQLException,
            ErroAoEditarAgendamentoException {

        AgendamentoDTO agendamento = new AgendamentoDTO(0, "fabio", "corte", "20",
                "10/11/2022", "11:00", "test");
        doNothing().when(agendamentodao).Editar(agendamento);
        agendamentodao.Editar(agendamento);
        verify(agendamentodao, times(1)).Editar(agendamento);

    }

    @Test
    public void TesteParaVerificarSeLancaErroAoTentarEditar()
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoEditarAgendamentoException {
        AgendamentoDTO agendamento = new AgendamentoDTO(0, "fabio", "corte", "20",
                "10/11/2022", "11:00", "test");
        doThrow(new ErroAoEditarAgendamentoException())
                .when(agendamentodao).Editar(agendamento);
        ErroAoEditarAgendamentoException exception
                = Assert.assertThrows(ErroAoEditarAgendamentoException.class,
                        () -> agendamentodao.Editar(agendamento));
        Assert.assertEquals("Erro ao Tentar Editar Agendamento", exception.getMessage());
    }

    @Test
    public void TesteParaVerificarSeEstarExcluindoUsuario()
            throws NaoFoiPossivelEstabelecerConexaoComBDException, ErroAoTentarExcluirAgendamentoException {

        AgendamentoDTO agendamento = new AgendamentoDTO(1, "fabio", "corte", "20",
                "10/11/2022", "11:00", "test");
        doNothing().when(agendamentodao).Excluir(agendamento);
        agendamentodao.Excluir(agendamento);
        verify(agendamentodao, times(1)).Excluir(agendamento);

    }

    @Test
    public void DeveRetornarMensagemDeErroAoTentarExcluirAgendamento()
            throws NaoFoiPossivelEstabelecerConexaoComBDException, 
            ErroAoTentarExcluirAgendamentoException {
        
        AgendamentoDTO agendamento = new AgendamentoDTO(1, "fabio", "corte", "20",
                "10/11/2022", "11:00", "test");
        doThrow(new ErroAoTentarExcluirAgendamentoException())
                .when(agendamentodao).Excluir(agendamento);
        ErroAoTentarExcluirAgendamentoException exception 
                = Assert.assertThrows(ErroAoTentarExcluirAgendamentoException.class,
                        ()-> agendamentodao.Excluir(agendamento));
        Assert.assertEquals("Erro ao tentar excluir agendamento", exception.getMessage());
    }
}
