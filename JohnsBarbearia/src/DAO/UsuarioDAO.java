package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    Connection conn;
    PreparedStatement pstm;

    public void CadastrarUsuario(UsuarioDTO objUsuarioDTO) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "insert into usuario "
                    + "(CPF_usuario, nome_usuario, senha_usuario) values(?,?,?)";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getCPF_usuario());
            pstm.setString(2, objUsuarioDTO.getNome_usuario());
            pstm.setString(3, objUsuarioDTO.getSenha_usuario());
            pstm.execute();
            pstm.close();

        } catch (SQLException erro) { //testar se esse erro aparece
            System.out.println("Não foi possivél cadastrar usuário");
        }

    }

    public boolean autenticacaoUsuario(UsuarioDTO objUsuarioDTO) {
        conn = new ConexaoDAO().conectaBD();
        boolean checar = false;

        try {
            String sql = "select * from usuario "
                    + "where CPF_usuario= ? and senha_usuario = ?";

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getCPF_usuario());
            pstm.setString(2, objUsuarioDTO.getSenha_usuario());

            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                checar = true;
            }

        } catch (SQLException erro) {
            System.out.println("Usuario não Cadastrado");

        }
        return checar;
    }

    public boolean verificarDadosBDCpf(UsuarioDTO objUsuarioDTO) {
        conn = new ConexaoDAO().conectaBD();
        boolean checar = false;

        try {
            String sql = "select * from usuario "
                    + "where CPF_usuario = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getCPF_usuario());

            ResultSet rs = null;
            rs = pstm.executeQuery();
            if (rs.next()) {
                checar = true;
            }

        } catch (SQLException erro) {
            System.out.println("Errou ao verificar dados" + erro);
        }
        return checar;
    }
}
