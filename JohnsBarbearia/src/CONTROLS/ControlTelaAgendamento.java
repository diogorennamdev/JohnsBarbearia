package CONTROLS;

import DAO.AgendamentoDAO;
import DTO.AgendamentoDTO;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControlTelaAgendamento {

    public static boolean Agendar(String nome_cliente,
            String servico,
            String valor_servico,
            String data_agendamento,
            String hora_agendamento,
            String observacao_agendamento) {

        AgendamentoDTO objAgendamentoDTO = new AgendamentoDTO();
        objAgendamentoDTO.setNome_cliente(nome_cliente);
        objAgendamentoDTO.setServico(servico);
        objAgendamentoDTO.setValor_servico(valor_servico);
        objAgendamentoDTO.setData_agendamento(data_agendamento);
        objAgendamentoDTO.setHora_agendamento(hora_agendamento);
        objAgendamentoDTO.setObservacao_agendamento(observacao_agendamento);

        AgendamentoDAO objAgendamentoDAO = new AgendamentoDAO();
        objAgendamentoDAO.Agendar(objAgendamentoDTO);
        return true;
    }

    public static JTable LerTabela(JTable TabelaAgendamentoJTable) {
        DefaultTableModel modelo = (DefaultTableModel) TabelaAgendamentoJTable.getModel();
        modelo.setNumRows(0);
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        for (AgendamentoDTO agendar : agendamentoDAO.Horarios()) {
            modelo.addRow(new Object[]{
                agendar.getNome_cliente(),
                agendar.getServico(),
                agendar.getValor_servico(),
                agendar.getData_agendamento(),
                agendar.getHora_agendamento(),
                agendar.getObservacao_agendamento()});
        }
        return TabelaAgendamentoJTable;

    }

}
