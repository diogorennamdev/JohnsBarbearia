package CONTROLS;

import DAO.AgendamentoDAO;
import DTO.AgendamentoDTO;
import EXCEPTIONS.ErroAoEditarAgendamentoException;
import EXCEPTIONS.ErroAoListarDadosException;
import EXCEPTIONS.ErroAoTentarExcluirAgendamentoException;
import EXCEPTIONS.ErroAoTentarLimpaAgendaException;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBDException;
import EXCEPTIONS.NaoFoiPossivelRealizarAgendamentoException;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControlTelaAgendamento {

    public static boolean Agendamento(
            String nome_cliente,
            String servico,
            String valor_servico,
            String data_agendamento,
            String hora_agendamento,
            String observacao_agendamento)
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            NaoFoiPossivelRealizarAgendamentoException,
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

    public static String TestaAgendamento(
            String nome_cliente,
            String servico,
            String valor_servico,
            String data_agendamento,
            String hora_agendamento,
            String observacao_agendamento)
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            NaoFoiPossivelRealizarAgendamentoException,
            SQLException {

        String response = null;
        if (nome_cliente.equals("")
                || valor_servico.equals("")
                || data_agendamento.equals("")
                || hora_agendamento.equals("")) {
            response = "CAMPOS VAZIOS!\n Por favor insira os dados";

        } else if (ControlTelaAgendamento.Agendamento(
                nome_cliente,
                servico,
                valor_servico,
                data_agendamento,
                hora_agendamento,
                observacao_agendamento)) {
        }
        return response;
    }

    public static JTable PreencherTabela(JTable TabelaAgendamentoJTable)
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoListarDadosException {

        DefaultTableModel modelo
                = (DefaultTableModel) TabelaAgendamentoJTable.getModel();
        modelo.setNumRows(0);
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        for (AgendamentoDTO agendar : agendamentoDAO.ListarHorarios()) {
            modelo.addRow(new Object[]{
                agendar.getID_agendamento(),
                agendar.getNome_cliente(),
                agendar.getServico(),
                agendar.getValor_servico(),
                agendar.getData_agendamento(),
                agendar.getHora_agendamento(),
                agendar.getObservacao_agendamento()});
        }
        return TabelaAgendamentoJTable;
    }

    public static void EditarAgendamento(String nome_cliente,
            String servico,
            String valor_servico,
            String data_agendamento,
            String hora_agendamento,
            String observacao_agendamento,
            int ID_agendamento)
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoEditarAgendamentoException {

        AgendamentoDTO editar = new AgendamentoDTO();
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();

        editar.setNome_cliente(nome_cliente);
        editar.setServico(servico);
        editar.setValor_servico(valor_servico);
        editar.setData_agendamento(data_agendamento);
        editar.setHora_agendamento(hora_agendamento);
        editar.setObservacao_agendamento(observacao_agendamento);
        editar.setID_agendamento(ID_agendamento);
        agendamentoDAO.Editar(editar);
    }

    public static void ExcluirAgendamento(JTable TabelaAgendamentoJTable)
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoTentarExcluirAgendamentoException {

        if (TabelaAgendamentoJTable.getSelectedRow() != -1) {
            AgendamentoDTO excluir = new AgendamentoDTO();
            AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
            excluir.setID_agendamento((int) TabelaAgendamentoJTable.getValueAt(
                    TabelaAgendamentoJTable.getSelectedRow(), 0));
            agendamentoDAO.Excluir(excluir);
        }
    }

    public static void LimparAgenda(JTable TabelaAgendamentoJTable)
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoTentarLimpaAgendaException {

        TabelaAgendamentoJTable.selectAll();
        AgendamentoDTO limpar = new AgendamentoDTO();
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        limpar.setID_agendamento((int) TabelaAgendamentoJTable.getValueAt(
                TabelaAgendamentoJTable.getSelectedRow(), 0));
        agendamentoDAO.LimparAgenda(limpar);
    }
}
