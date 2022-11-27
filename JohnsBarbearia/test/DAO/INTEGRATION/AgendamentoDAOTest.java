package DAO.INTEGRATION;

import DAO.AgendamentoDAO;
import DTO.AgendamentoDTO;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBDException;
import EXCEPTIONS.NaoFoiPossivelRealizarAgendamentoException;
import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;


public class AgendamentoDAOTest {

    private final AgendamentoDTO agendamentodto = new AgendamentoDTO();
    private final AgendamentoDAO agendamentodao = new AgendamentoDAO();

    @Before
    public void init(){
      
    }
    @Test
    public void TesteParaVerificarSeEstarInserindoAgendamento()
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            NaoFoiPossivelRealizarAgendamentoException, SQLException { 
        
         AgendamentoDTO agendamento = new AgendamentoDTO(0, "Diogo","corte", "10",
             "28/11/2022", "20:00", "teste");
        doNothing().when(agendamentodao).Agendar(agendamento);
        agendamentodao.Agendar(agendamento);
        verify(agendamentodao, times(1)).Agendar(agendamento);

    } 
    
    @Test
    public void TesteParaVerificarMensagemDeErroAoinserirAgendamento() 
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            NaoFoiPossivelRealizarAgendamentoException, SQLException{ 
        
          AgendamentoDTO agendamento = new AgendamentoDTO(0, "diogo", "corte", "30",
                "22/12/2022", "10:00", "teste");
          doThrow(new SQLException()).when(agendamentodao).Agendar(agendamento);
          
          
    }
}
