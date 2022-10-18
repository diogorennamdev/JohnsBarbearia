package CONTROLS;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import HELPERS.Cliptografia;
import VIEW.JFrameTelaAgendamento;
import VIEW.JFrameTelaCadastro;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControlTelaLogin {

    public static void entrarSistema(String email_usuario,
            String senha_usuario) {

        try {
            UsuarioDTO objusuariodto = new UsuarioDTO();
            objusuariodto.setEmail_usuario(email_usuario);
            objusuariodto.setSenha_usuario( //verificar se está chamAndo senha criptografada
                    Cliptografia.criptografiaDaSenha(senha_usuario));

            UsuarioDAO objusuariodao = new UsuarioDAO();
            ResultSet usuariodao = objusuariodao.autenticacaoUsuario(
                    objusuariodto);

            if (usuariodao.next() == true) {
              chamarTelaAgendamento();
            } else if (usuariodao.next() == false) {
                // enviar mensagem dizendo incorreto   
                JOptionPane.showMessageDialog(null,
                        //criar um metodo que diferncie o usario inválido da senha inválida
                        "usuario ou senha inválido");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,
                    "erro ao entrar" + erro);
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
