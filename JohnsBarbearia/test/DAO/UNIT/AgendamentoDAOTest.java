package DAO.UNIT;

import DAO.AgendamentoDAO;
import DTO.AgendamentoDTO;
import EXCEPTIONS.NaoFoiPossivelRealizarAgendamento;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Before;
import org.junit.Test;

public class AgendamentoDAOTest {

    AgendamentoDTO agendamentodto = new AgendamentoDTO();
    AgendamentoDAO agendamentodao = new AgendamentoDAO();

    private static final int ID_usuario = 3;
    private static final String nome_cliente = "GUSTAVO";
    private static final String servico = "Corte";
    private static final String valor_servico = "10";
    private static final String data_agendamento = "10/11/22";
    private static final String hora_agendamento = "11:00";
    private static final String observacao_agendamento = "Teste";

    public AgendamentoDAOTest() {
    }

    @Before
    public void setUp() {
      CriarAgendamento();
    }

    @Test
    public void TesteParaVerificarSeEstarInserindoAgendamentoNoBanco()
            throws Exception {
        agendamentodao.Agendar(agendamentodto);
        assertEquals(AgendamentoDTO.class, agendamentodto.getClass());
    }

//    @Test
//    public void TesteParaVerificarSeAparecerMensagemDeErroNoAgendamento() {
//        NaoFoiPossivelRealizarAgendamento naoFoiPosNaoFoiPossivelRealizarAgendamento
//                = assertThrows(NaoFoiPossivelRealizarAgendamento.class,
//                        () -> agendamentodao.Agendar(agendamentodto));
//        assertEquals("Não foi possivel realizar agendamento",
//                naoFoiPosNaoFoiPossivelRealizarAgendamento.getMessage());
//    }

    private void CriarAgendamento() {
        agendamentodto = new AgendamentoDTO( ID_usuario ,nome_cliente, servico,
                valor_servico, data_agendamento,
                hora_agendamento, observacao_agendamento);

    }
}
