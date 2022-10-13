package CONTROL;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import VIEW.JFrameTelaAgendamento;
import VIEW.JFrameTelaCadastro;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControlTelaLogin {

    public static void entrarsistemaActionPerformed (String email, String senha) {
        try {

            UsuarioDTO objusuariodto = new UsuarioDTO();
            objusuariodto.setEmail_usuario(email);
            objusuariodto.setSenha_usuario(senha);

            UsuarioDAO objusuariodao = new UsuarioDAO();
            ResultSet rsusuariodao = objusuariodao.autenticacaoUsuario(objusuariodto);

            if (rsusuariodao.next()) {
                // chama tela que eu quero abrir    
                JFrameTelaAgendamento objJframeTelaAgendamento = new JFrameTelaAgendamento();
                objJframeTelaAgendamento.setVisible(true);

            } else {
                // enviar mensagem dizendo incorreto   
                JOptionPane.showMessageDialog(null, "usuario ou senha invalido");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro ao entrar" + erro);
        }
    }

    public static void criarcontaJButtonActionPerformed() {
        JFrameTelaCadastro janelaJframeTelaCadastro = new JFrameTelaCadastro();
        janelaJframeTelaCadastro.setVisible(true);

    }
}
