package CONTROLS;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import HELPERS.Criptografia;
import VIEW.JFrameTelaAgendamento;
import VIEW.JFrameTelaCadastro;
import javax.swing.JOptionPane;

public class ControlTelaLogin {

    public static boolean entrarSistema(String CPF_usuario,
            String senha_usuario) {

        UsuarioDTO objUsuariodto = new UsuarioDTO();
        objUsuariodto.setCPF_usuario(CPF_usuario);
        objUsuariodto.setSenha_usuario(
                Criptografia.criptografiaDaSenha(senha_usuario));

        UsuarioDAO objUsuariodao = new UsuarioDAO();
        objUsuariodao.autenticacaoUsuario(
                objUsuariodto);
        boolean fechar = false;
        if (objUsuariodao.autenticacaoUsuario(objUsuariodto)) {
            chamarTelaAgendamento();
            fechar = true;
        }
        return fechar;
    }

    public static boolean validarDadosLogin(String CPF_usuario,
            String senha_usuario) {
        if (CPF_usuario.equals("")
                || senha_usuario.equals("")) {
            JOptionPane.showMessageDialog(null,
                    "CAMPOS VAZIOS!\n Por favor insira os dados.");
            return false;
        } else if (ControlTelaLogin.entrarSistema(CPF_usuario, senha_usuario)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null,
                    " USUÁRIO NÃO CADASTRADO!\n Por favor tente novamente.");
            return false;
        }

    }

    //Metodo que retorna JframeTelaCadastro
    public static void chamarTelaCadastro() {
        JFrameTelaCadastro janelaJframeTelaCadastro
                = new JFrameTelaCadastro();
        janelaJframeTelaCadastro.setVisible(true);
    }

    public static void chamarTelaAgendamento() {
        JFrameTelaAgendamento telaJframeTelaAgendamento
                = new JFrameTelaAgendamento();
        telaJframeTelaAgendamento.setVisible(true);
    }
}
