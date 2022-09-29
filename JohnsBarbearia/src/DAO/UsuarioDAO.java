
package DAO;
import DAO.ConexaoDAO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
       Connection conn = null;
    
    public ResultSet autenticaUsuario(UsuarioDTO usuarioDTO){
        try {
            conn = new ConexaoDAO().conectaBD();
            String query = "select * from usuario where email_usuario=? and senha=?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, usuarioDTO.getEmail_usuario ());
            pstm.setString(2,usuarioDTO.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException ex) { 
            System.out.println("Erro na consulta para autenticção" + ex);
            return null;
        }
    }
}
