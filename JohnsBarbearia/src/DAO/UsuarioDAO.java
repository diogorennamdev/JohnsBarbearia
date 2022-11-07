package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conn;
    PreparedStatement pstm;

    public boolean autenticacaoUsuario(UsuarioDTO objUsuarioDTO) {
        conn = new ConexaoDAO().conectaBD();
        boolean checar = false;

        try {
            String sql = "select * from usuario "
                    + "where email_usuario= ? and senha_usuario=?";

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getEmail_usuario());
            pstm.setString(2, objUsuarioDTO.getSenha_usuario());

            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                checar = true;
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
        }
        return checar;
    }

    public boolean CadastrarUsuario(UsuarioDTO objUsuariodto) {
        conn = new ConexaoDAO().conectaBD();
        boolean cadastrar = false;

        try {
            String sql = "insert into "
                    + "usuario(CPF_usuario, nome_usuario,"
                    + "email_usuario, senha_usuario) values(?,?,?,?)";

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuariodto.getCPF_usuario());
            pstm.setString(2, objUsuariodto.getNome_usuario());
            pstm.setString(3, objUsuariodto.getEmail_usuario());
            pstm.setString(4, objUsuariodto.getSenha_usuario());

            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                cadastrar = true;

            }

        } catch (SQLException erro) { //testar se esse erro aparece
            JOptionPane.showMessageDialog(null, "Não foi possivél cadastrar usuário" + erro);

        }
        return cadastrar;

    }

}
