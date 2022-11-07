package CONTROLS;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import HELPERS.Criptografia;
import HELPERS.Validacoes;
import VIEW.JframeTelaLogin;

public class ControlTelaCadastro {

    public static boolean cadastrar(String CPF_usuario,
            String nome_usuario,
            String email_usuario,
            String senha_usuario) {

        UsuarioDTO objUsuariodto = new UsuarioDTO();
        objUsuariodto.setCPF_usuario(CPF_usuario);
        objUsuariodto.setNome_usuario(nome_usuario);
        objUsuariodto.setEmail_usuario(email_usuario);
        objUsuariodto.setSenha_usuario(
                Criptografia.criptografiaDaSenha(senha_usuario));

        UsuarioDAO objUsuariodao = new UsuarioDAO();
        objUsuariodao.CadastrarUsuario(objUsuariodto);
        
        boolean fechar = false;
        if (objUsuariodao.autenticacaoUsuario(objUsuariodto) == true) {
            chamarTelaLogin();
            fechar = true;
        }
        return fechar;

    }

    public static String ValidarDadosCPF(String CPF_usuario,
            String nome_usuario, String email_usuario, String senha_usuario) {
        String response = null;
        if (CPF_usuario.equals("") || nome_usuario.equals("")
                || email_usuario.equals("") || senha_usuario.equals("")) {
            response = " CAMPOS VAZIOS!\n Por favor insira os dados";
        } else if (Validacoes.validarCPF(CPF_usuario) == true) {
            ControlTelaCadastro.cadastrar(CPF_usuario, nome_usuario, email_usuario, senha_usuario);
            response = "USUÁRIO CADASTRADO!\n";
            
        } else if (Validacoes.validarCPF(CPF_usuario) == false) {
            response = "ERRO, CPF INVÁLIDO!\n";

        }
        return response;
    }

    //Metodo que retorna JframeTelaLogin
    public static void chamarTelaLogin() {
        JframeTelaLogin janelaJframeTelaLogin = new JframeTelaLogin();
        janelaJframeTelaLogin.setVisible(true);
    }
}
