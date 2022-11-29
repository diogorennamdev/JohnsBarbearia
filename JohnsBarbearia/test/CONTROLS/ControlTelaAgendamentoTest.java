package CONTROLS;

import javax.swing.JTable;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControlTelaAgendamentoTest {

    public ControlTelaAgendamentoTest() {
    }

    @Test
    public void DeverRetornarMensagemQuandoUsuarioDeixaCamposVazios() throws Exception {
        String nome = "", servico = "", valor = "", hora = "", data = "", observacao = "";
        String mensagem_campos_vazio = ControlTelaAgendamento.Agendar(nome, servico, valor, data, hora, observacao);
        assertEquals("CAMPOS VAZIOS!\n Por favor insira os dados", mensagem_campos_vazio);
    }

    @Test
    public void testAgendar() throws Exception {

    }

    @Test
    public void testPreencherTabela() throws Exception {

    }

    @Test
    public void testEditarAgendamento() throws Exception {

    }

    @Test
    public void testExcluirAgendamento() throws Exception {

    }

    @Test
    public void testLimparAgendamento() throws Exception {

    }

}
