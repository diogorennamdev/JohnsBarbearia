package CONTROLS;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import HELPERS.Cliptografia;
import HELPERS.Validacoes;
import VIEW.JframeTelaLogin;
import javax.swing.JOptionPane;

public class ControlTelaCadastro {

    public static void cadastrar(String CPF_usuario, 
            String nome_usuario, 
            String email_usuario, 
            String senha_usuario) {

        UsuarioDTO objUsuariodto = new UsuarioDTO();
        objUsuariodto.setCPF_usuario(CPF_usuario);
        objUsuariodto.setNome_usuario(nome_usuario);
        objUsuariodto.setEmail_usuario(email_usuario);
        objUsuariodto.setSenha_usuario(
                Cliptografia.criptografiaDaSenha(senha_usuario));

        UsuarioDAO objUsuariodao = new UsuarioDAO();
        if (Validacoes.validarCPF(CPF_usuario)==true){
            JOptionPane.showMessageDialog(null, 
                    "CADATRO REALIZADO\n");
             objUsuariodao.CadastrarUsuario(objUsuariodto);
        }else{
            JOptionPane.showMessageDialog(null, 
                    "ERRO, CPF INVÁLIDO!\n");       
        }
    }
     
    //Butão cadastrar na tela de cadastro que retorna para tela de login
    public static void CadastrarJButtonActionPerformed() {
        JframeTelaLogin janelaJframeTelaLogin = new JframeTelaLogin();
        janelaJframeTelaLogin.setVisible(true);
    }

    //Butão sair na tela de cadastro que retorna para tela de login
    public static void SairJButtonActionPerformed() {
        JframeTelaLogin janelaJframeTelaLogin = new JframeTelaLogin();
        janelaJframeTelaLogin.setVisible(true);
    }

}
