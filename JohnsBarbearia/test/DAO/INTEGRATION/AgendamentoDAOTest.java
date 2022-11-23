package DAO.INTEGRATION;

import DAO.AgendamentoDAO;
import DTO.AgendamentoDTO;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBD;
import EXCEPTIONS.NaoFoiPossivelRealizarAgendamento;
import java.sql.SQLException;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class AgendamentoDAOTest {

    private final AgendamentoDTO agendamento = new AgendamentoDTO();
    private final AgendamentoDAO agendamentodao = new AgendamentoDAO();

    @Test
    public void TesteParaVerificarSeEstarInserindoAgendamento()
            throws NaoFoiPossivelEstabelecerConexaoComBD,
            NaoFoiPossivelRealizarAgendamento, SQLException {
        AgendamentoDTO agendamento = new AgendamentoDTO("julio", "corte",
                "30", "20/11/2022", "20:00", "Teste");

        doNothing().when(agendamentodao).Agendar(agendamento);
        agendamentodao.Agendar(agendamento);
        verify(agendamentodao, times(1)).Agendar(agendamento);

    }
}
