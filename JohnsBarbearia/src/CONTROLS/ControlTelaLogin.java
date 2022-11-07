package CONTROLS;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import HELPERS.Criptografia;
import VIEW.JFrameTelaAgendamento;
import VIEW.JFrameTelaCadastro;

public class ControlTelaLogin {

    public static boolean entrarSistema(String email_usuario,
            String senha_usuario) {

        UsuarioDTO objUsuariodto = new UsuarioDTO();
        objUsuariodto.setEmail_usuario(email_usuario);
        objUsuariodto.setSenha_usuario( //verificar se está chamAndo senha criptografada
                Criptografia.criptografiaDaSenha(senha_usuario));

        UsuarioDAO objUsuariodao = new UsuarioDAO();
        objUsuariodao.autenticacaoUsuario(
                objUsuariodto);
        boolean fechar = false;
        if (objUsuariodao.autenticacaoUsuario(objUsuariodto) == true) {
            chamarTelaAgendamento();
            fechar = true;
        }
        return fechar;
    }

    public static String validarDadosLogin(String email_usuario,
            String senha_usuario) {
        String response;
        if (email_usuario.equals("")|| senha_usuario.equals("")) {
            response = " CAMPOS VAZIOS!\n Por favor insira os dados.";
        } else if (ControlTelaLogin.entrarSistema(email_usuario,senha_usuario)) {
            response = null;
        } else {
            response = " EMAIL NÃO CADASTRADO!\n Por favor tente novamente.";
        }
        return response;
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
