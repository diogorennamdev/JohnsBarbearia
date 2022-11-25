package DAO.INTEGRATION;

import DAO.AgendamentoDAO;
import DTO.AgendamentoDTO;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBD;
import EXCEPTIONS.NaoFoiPossivelRealizarAgendamento;
import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import sun.jvm.hotspot.utilities.soql.SOQLException;

public class AgendamentoDAOTest {

    private final AgendamentoDTO agendamentodto = new AgendamentoDTO();
    private final AgendamentoDAO agendamentodao = new AgendamentoDAO();

    @Before
    public void init(){
      
    }
    @Test
    public void TesteParaVerificarSeEstarInserindoAgendamento()
            throws NaoFoiPossivelEstabelecerConexaoComBD,
            NaoFoiPossivelRealizarAgendamento, SQLException { 
        
         AgendamentoDTO agendamento = new AgendamentoDTO(1, "Diogo","corte", "10",
             "28/11/2022", "20:00", "teste");
        doNothing().when(agendamentodao).Agendar(agendamento);
        agendamentodao.Agendar(agendamento);
        verify(agendamentodao, times(1)).Agendar(agendamento);

    } 
    
    @Test
    public void TesteParaVerificarMensagemDeErroAoinserirAgendamento() 
            throws NaoFoiPossivelEstabelecerConexaoComBD,
            NaoFoiPossivelRealizarAgendamento, SQLException{ 
        
          AgendamentoDTO agendamento = new AgendamentoDTO(0, "diogo", "corte", "30",
                "22/12/2022", "10:00", "teste");
          doThrow(new SQLException()).when(agendamentodao).Agendar(agendamento);
          
    }
}
