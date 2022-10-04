package VIEW;
import DAO.ConexaoDAO;
import DTO.UsuarioDTO;
import VIEW.JframeTelaLogin;
public class TelaLogin {

    public static void main(String[] args) {
        new JframeTelaLogin().setVisible(true);

    }   
    
    public static void fazerlogin(String email_usuario, String senha_usuario){
        email_usuario = txtEmailUsuario.getText();
    }
}
