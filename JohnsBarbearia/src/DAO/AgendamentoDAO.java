package DAO;

import EXCEPTIONS.NaoFoiPossivelRealizarAgendamento;
import DTO.AgendamentoDTO;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBD;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class AgendamentoDAO {

    Connection conn;
    PreparedStatement pstm;

    public void Agendar(AgendamentoDTO objAgendamentoDTO)
            throws NaoFoiPossivelEstabelecerConexaoComBD,
            NaoFoiPossivelRealizarAgendamento,
            SQLException {

        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "insert into agendamento"
                    + "(nome_cliente, servico, valor_servico, data_agendamento,"
                    + "hora_agendamento, observacao_agendamento,CPF_usuario) "
                    + "values (?,?,?,?,?,?,?)";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,
                    objAgendamentoDTO.getNome_cliente());
            pstm.setString(2,
                    objAgendamentoDTO.getServico());
            pstm.setString(3,
                    objAgendamentoDTO.getValor_servico());
            pstm.setString(4,
                    objAgendamentoDTO.getData_agendamento());
            pstm.setString(5,
                    objAgendamentoDTO.getHora_agendamento());
            pstm.setString(6,
                    objAgendamentoDTO.getObservacao_agendamento());
            pstm.setString(7,
                    objAgendamentoDTO.getCPF_usuario());
            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
          System.out.println("Não foi possivél fazer agendamento " + erro);
          throw new NaoFoiPossivelRealizarAgendamento();
        }
    }

    public java.util.List<AgendamentoDTO> Horarios()
            throws NaoFoiPossivelEstabelecerConexaoComBD {

        conn = new ConexaoDAO().conectaBD();
        ResultSet rs;
        List<AgendamentoDTO> horarios = new ArrayList<>();
        try {
            pstm = conn.prepareStatement("select * from agendamento");
            rs = pstm.executeQuery();
            while (rs.next()) {
                AgendamentoDTO agendamento = new AgendamentoDTO();
                agendamento.setNome_cliente(
                        rs.getString("nome_cliente"));
                agendamento.setServico(
                        rs.getString("servico"));
                agendamento.setValor_servico(
                        rs.getString("valor_servico"));
                agendamento.setData_agendamento(
                        rs.getString("data_agendamento"));
                agendamento.setHora_agendamento(
                        rs.getString("hora_agendamento"));
                agendamento.setObservacao_agendamento(
                        rs.getString("observacao_agendamento"));
                horarios.add(agendamento);

            }

        } catch (SQLException erro) {
            System.out.println("error em List<AgendamentoDTO> " + erro);
        }
        return horarios;
    }

    public void Excluir(AgendamentoDTO objAgendamentoDTO)
            throws NaoFoiPossivelEstabelecerConexaoComBD {
        
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "delete from agendamento where nome_cliente =?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objAgendamentoDTO.getNome_cliente());
            pstm.execute();

        } catch (SQLException erro) {
            System.out.println("erro ao tentar Excluir agendamento" + erro);

        }
    }

    public void Editar(AgendamentoDTO objAgendamentoDTO)
            throws NaoFoiPossivelEstabelecerConexaoComBD {
        
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "update agendamento set"
                    + " nome_cliente=?, servico=?, valor_servico=?,"
                    + " data_agendamento=?, hora_agendamento=?,"
                    + " observacao_agendamento=?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objAgendamentoDTO.getNome_cliente());
            pstm.setString(2, objAgendamentoDTO.getServico());
            pstm.setString(3, objAgendamentoDTO.getValor_servico());
            pstm.setString(4, objAgendamentoDTO.getData_agendamento());
            pstm.setString(5, objAgendamentoDTO.getHora_agendamento());
            pstm.setString(6, objAgendamentoDTO.getObservacao_agendamento());
            pstm.execute();

        } catch (SQLException erro) {
            System.out.println("erro ao tentar Editar agendamento" + erro);
        }
    }

}
