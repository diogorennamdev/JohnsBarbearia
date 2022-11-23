package CONTROLS;

import DAO.AgendamentoDAO;
import DTO.AgendamentoDTO;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBD;
import EXCEPTIONS.NaoFoiPossivelRealizarAgendamento;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControlTelaAgendamento  {

    public static boolean Agendar(String nome_cliente,
            String servico,
            String valor_servico,
            String data_agendamento,
            String hora_agendamento,
            String observacao_agendamento)
            throws NaoFoiPossivelEstabelecerConexaoComBD,
            NaoFoiPossivelRealizarAgendamento,
            SQLException {

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

    public static JTable LerTabela(JTable TabelaAgendamentoJTable)
            throws NaoFoiPossivelEstabelecerConexaoComBD {

        DefaultTableModel modelo
                = (DefaultTableModel) TabelaAgendamentoJTable.getModel();
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

    public static void ExcluirAgendamento(JTable TabelaAgendamentoJTable)
            throws NaoFoiPossivelEstabelecerConexaoComBD {
        
        if (TabelaAgendamentoJTable.getSelectedRow() != -1) {
            AgendamentoDTO agendar = new AgendamentoDTO();
            AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
            agendar.setNome_cliente((String) TabelaAgendamentoJTable.getValueAt(
                    TabelaAgendamentoJTable.getSelectedRow(), 0));
            agendamentoDAO.Excluir(agendar);
        }
    }

    public static boolean EditarAgendamento(JTable TabelaAgendamentoJTable, 
            String nome_cliente,
            String servico,
            String valor_servico,
            String data_agendamento,
            String hora_agendamento,
            String observacao_agendamento)
            throws NaoFoiPossivelEstabelecerConexaoComBD {
        
        if (nome_cliente.equals("")
                || servico.equals("")
                || valor_servico.equals("")
                || data_agendamento.equals("")
                || hora_agendamento.equals("")
                || observacao_agendamento.equals("")) {
            JOptionPane.showMessageDialog(null, 
                    " CAMPOS VAZIOS!\n Por favor insira os dados ");

            AgendamentoDTO agendar = new AgendamentoDTO();
            AgendamentoDAO agendamentoDAO = new AgendamentoDAO();

            agendar.setNome_cliente(nome_cliente);
            agendar.setServico(servico);
            agendar.setValor_servico(valor_servico);
            agendar.setData_agendamento(data_agendamento);
            agendar.setHora_agendamento(hora_agendamento);
            agendar.setObservacao_agendamento(observacao_agendamento);
            agendamentoDAO.Editar(agendar);
        }
        return false;

    }
}

