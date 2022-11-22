package DAO;

import DTO.AgendamentoDTO;
import DAO.AgendamentoDAO;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBD;
import EXCEPTIONS.NaoFoiPossivelRealizarAgendamento;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class AgendamentoDAOTest {

    private AgendamentoDAO agendamentodao = mock(AgendamentoDAO.class);
    private AgendamentoDTO agendamentodto = mock(AgendamentoDTO.class);

    @Test
    public void TesteParaVerificarSeEstarCriandoAgendamento()
            throws NaoFoiPossivelEstabelecerConexaoComBD,
            NaoFoiPossivelRealizarAgendamento, SQLException {
        AgendamentoDTO agendamento = new AgendamentoDTO(
                "Diogo", "corte", "20",
                "20/11/2022", "10:00",
                "Teste");

        doNothing().when(agendamentodao).Agendar(agendamento);
        agendamentodao.Agendar(agendamento);

        verify(agendamentodao, times(1)).Agendar(agendamento);
    }

    @Test
    public void TesteParaVerificarDadosNoArrayList() {
       List<AgendamentoDTO> horarios = new ArrayList<>();
       horarios.add( new AgendamentoDTO()) ;
    }

//
//    private static final String nome_cliente = "paulo";
//    private static final String servico = "Corte";
//    private static final String valor_servico = "10";
//    private static final String data_agendamento = "10/11/22";
//    private static final String hora_agendamento = "11:00";
//    private static final String observacao_agendamento = "Teste";
//
//    public AgendamentoDAOTest() {
//    }
//
//    @Before
//    public void setUp() {
//        CriarAgendamento();
//    }
//
//    @Test
//    public void TesteParaVerificarSeEstarInserindoAgendamentoNoBanco()
//            throws Exception {
//        agendamentodao.Agendar(agendamentodto);
//        assertEquals(AgendamentoDTO.class, agendamentodto.getClass());
//    }
//
//    @Test
//    public void TesteParaVerificarSeAparecerMensagemDeErroNoAgendamento() {
//        NaoFoiPossivelRealizarAgendamento naoFoiPosNaoFoiPossivelRealizarAgendamento
//                = assertThrows(NaoFoiPossivelRealizarAgendamento.class,
//                        () -> agendamentodao.Agendar(agendamentodto));
//        assertEquals("Não foi possivel realizar agendamento",
//                naoFoiPosNaoFoiPossivelRealizarAgendamento.getMessage());
//    }
//
//    private void CriarAgendamento() {
//        agendamentodto = new AgendamentoDTO(nome_cliente, servico,
//                valor_servico, data_agendamento,
//                hora_agendamento, observacao_agendamento);
//
//    }
}
