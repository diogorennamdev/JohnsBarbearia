package DAO.UNIT;

import DAO.AgendamentoDAO;
import DTO.AgendamentoDTO;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBDException;
import EXCEPTIONS.NaoFoiPossivelRealizarAgendamentoException;
import java.sql.SQLException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Before;
import org.junit.Test;

public class AgendamentoDAOTest {

    AgendamentoDTO agendamentodto = new AgendamentoDTO();
    AgendamentoDAO agendamentodao = new AgendamentoDAO();

    public AgendamentoDAOTest() {
    }

    @Before
    public void setUp() {
        //  CriarAgendamento();
    }

    @Test
    public void TesteParaVerificarSeEstarInserindoAgendamentoNoBanco()
            throws Exception {
        AgendamentoDTO agendamento = new AgendamentoDTO(5, "Fabio", "corte", "15",
                "20/12/2022", "20:00", "Teste1");
        agendamentodao.Agendar(agendamento);
        assertEquals(AgendamentoDTO.class, agendamentodto.getClass());
    }

    @Test
    public void TesteParaVerificarSeEstarEditandoAgendamento()
            throws NaoFoiPossivelEstabelecerConexaoComBDException {
        AgendamentoDTO agendamento = new AgendamentoDTO(5, "Fabio", "corte", "15",
                "20/12/2022", "20:00", "Teste1");

        agendamentodao.Editar(agendamento);
    }

    @Test
    public void TesteParaVericarExclusaoDoAgendamento() throws NaoFoiPossivelEstabelecerConexaoComBDException, NaoFoiPossivelRealizarAgendamentoException, SQLException {
        AgendamentoDTO agendamento = new AgendamentoDTO(5, "Fabio", "corte", "15",
                "20/12/2022", "20:00", "Teste1");
        agendamentodao.Agendar(agendamento); 
        
        agendamentodao.Excluir(agendamento);
        
    }
    @Test
    public void TesteParaVerificarSeAparecerMensagemDeErroNoAgendamento() { 
        AgendamentoDTO agendamento_invalido = new AgendamentoDTO(0, "c", 
                "", "", "", "", "");
        NaoFoiPossivelRealizarAgendamentoException naoFoiPosNaoFoiPossivelRealizarAgendamento
                = assertThrows(NaoFoiPossivelRealizarAgendamentoException.class,
                        () -> agendamentodao.Agendar(agendamento_invalido));
        
        assertEquals("Não foi possivel realizar agendamento",
                naoFoiPosNaoFoiPossivelRealizarAgendamento.getMessage());
    }

}
