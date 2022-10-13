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

    public ResultSet autenticacaoUsuario(UsuarioDTO objUsuarioDTO) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select * from usuario where email_usuario= ? and senha_usuario=?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getEmail_usuario());
            pstm.setString(2, objUsuarioDTO.getSenha_usuario());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO:" + erro);
            return null;
        }
    }

    public void CadastrarUsuario(UsuarioDTO objUsuariodto) {
        String sql = "insert into usuario(nome_usuario, email_usuario, senha_usuario) values(?,?,?)";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuariodto.getNome_usuario());
            pstm.setString(2, objUsuariodto.getEmail_usuario());
            pstm.setString(3, objUsuariodto.getSenha_usuario());
            
            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivél cadastrar usuário" + erro);
        }
    }

}
