package CONTROLS;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import HELPERS.Criptografia;
import VIEW.JFrameTelaAgendamento;
import VIEW.JFrameTelaCadastro;
import javax.swing.JOptionPane;

public class ControlTelaLogin {

    public static void entrarSistema(String email_usuario,
            String senha_usuario) {

        UsuarioDTO objusuariodto = new UsuarioDTO();
        objusuariodto.setEmail_usuario(email_usuario);
        objusuariodto.setSenha_usuario( //verificar se está chamAndo senha criptografada
                Criptografia.criptografiaDaSenha(senha_usuario));

        UsuarioDAO objusuariodao = new UsuarioDAO();
        objusuariodao.autenticacaoUsuario(
                objusuariodto);
        if (objusuariodao.autenticacaoUsuario(objusuariodto) == true){
        chamarTelaAgendamento();
        } else {
            JOptionPane.showMessageDialog(null, "Email não cadastrado");
        }
    }

    //Metodo que retorna JframeTelaCadastro
    public static void chamarTelaCadastro() {
        JFrameTelaCadastro janelaJframeTelaCadastro = new JFrameTelaCadastro();
        janelaJframeTelaCadastro.setVisible(true);
    }

    public static void chamarTelaAgendamento() {
        JFrameTelaAgendamento telaJframeTelaAgendamento = new JFrameTelaAgendamento();
        telaJframeTelaAgendamento.setVisible(true);
    }
}
