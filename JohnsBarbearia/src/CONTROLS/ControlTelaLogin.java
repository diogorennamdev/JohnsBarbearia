package CONTROLS;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import HELPERS.Criptografia;
import VIEW.JFrameTelaAgendamento;
import VIEW.JFrameTelaCadastro;
import javax.swing.JOptionPane;

public class ControlTelaLogin {

    public static boolean entrarSistema(String email_usuario,
            String senha_usuario) {

        UsuarioDTO objusuariodto = new UsuarioDTO();
        objusuariodto.setEmail_usuario(email_usuario);
        objusuariodto.setSenha_usuario( //verificar se está chamAndo senha criptografada
                Criptografia.criptografiaDaSenha(senha_usuario));

        UsuarioDAO objusuariodao = new UsuarioDAO();
        objusuariodao.autenticacaoUsuario(
                objusuariodto);
        boolean fechar = false;
        if (objusuariodao.autenticacaoUsuario(objusuariodto) == true){
        chamarTelaAgendamento();
        fechar =true;
        }
        return fechar;
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
