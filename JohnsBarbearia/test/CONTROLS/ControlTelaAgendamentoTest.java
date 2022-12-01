package CONTROLS;

import DAO.AgendamentoDAO;
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

        boolean novo_agendamento = ControlTelaAgendamento.Agendamento(nome_cliente,
                servico, valor_servico, data_agendamento, hora_agendamento,
                observacao);
        assertEquals(true, novo_agendamento);
    }

    @Test
    public void DevePreencherTabelaComSucesso() throws Exception {

        String nome_cliente = "Julio", servico = "Corte",
                valor_servico = "10", data_agendamento = "10/12/2022",
                hora_agendamento = "10:00", observacao_agendamento = "teste";
        agendamentodao.ListarHorarios();
    }

    @Test
    public void TesteParaVerificarSeestarEditandoAgendamento() throws Exception {

        //Atualizando nome do Cliente e Horario de Atendimento
        ControlTelaAgendamento.EditarAgendamento("Roberto Silva", servico,
                valor_servico, data_agendamento, "13:00",
                observacao, 1);
    }

    @Test
    public void TesteParaVerificarSeEstarExcluindoAgendamento() throws Exception {
        //   ControlTelaAgendamento.ExcluirAgendamento();
    }

    @Test
    public void testLimparAgendamento() throws Exception {
    }
}
