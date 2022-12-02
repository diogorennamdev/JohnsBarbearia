package CONTROLS;

import DAO.AgendamentoDAO;
import DTO.AgendamentoDTO;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControlTelaAgendamentoTest {

    AgendamentoDAO agendamentodao = new AgendamentoDAO();

    public ControlTelaAgendamentoTest() {
    }

    private final String nome_cliente = "Roberto";
    private final String servico = "Corte";
    private final String valor_servico = "10";
    private final String data_agendamento = "20/12/2022";
    private final String hora_agendamento = "14:00";
    private final String observacao = "Teste";

    //Será usado o mesmo agendamento em todos metodos 
    AgendamentoDTO agendamento = new AgendamentoDTO(0, nome_cliente, servico,
            valor_servico, data_agendamento, hora_agendamento, observacao);

    @Test
    public void DeverRetornarMensagemQuandoUsuarioDeixaCamposVazios()
            throws Exception {

        String nome = "", servico = "", valor = "",
                hora = "", data = "", observacao = "";
        String mensagem_campos_vazio = ControlTelaAgendamento
                .TestaAgendamento(nome, servico, valor, data, hora, observacao);
        assertEquals("CAMPOS VAZIOS!\n Por favor insira os dados",
                mensagem_campos_vazio);
    }

    @Test
    public void DeveCriarUmAgendamentoComSucesso() throws Exception {

        agendamentodao.Agendar(agendamento);
        assertEquals(AgendamentoDTO.class, agendamento.getClass());
    }

    @Test
    public void TesteParaVerificarSeEstarEditandoAgendamento() throws Exception {

        //Atualizando nome do Cliente e Horario de Atendimento
        AgendamentoDTO agendamento_atualizado 
                = new AgendamentoDTO(1, "Roberto Silva", servico,
                valor_servico, data_agendamento, "13:00",
                observacao);
        agendamentodao.Editar(agendamento_atualizado);
        assertEquals(AgendamentoDTO.class, agendamento_atualizado.getClass());
    }

    @Test
    public void TesteParaVerificarSeEstarExcluindoAgendamento() throws Exception {
        AgendamentoDTO agendamento_existente 
                = new AgendamentoDTO(1, "Roberto Silva", servico,
                valor_servico, data_agendamento, "13:00",
                observacao);

        agendamentodao.Excluir(agendamento_existente);
        assertNotNull(agendamento_existente);
    }
}
