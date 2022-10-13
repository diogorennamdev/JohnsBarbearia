package CONTROL;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import VIEW.JframeTelaLogin;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ControlTelaCadastro {

    public static void CadastrarJButtonActionPerformed(String nome_usuario, String email_usuario, String senha_usuario) {

        UsuarioDTO objUsuariodto = new UsuarioDTO();

        objUsuariodto.setNome_usuario(nome_usuario);
        objUsuariodto.setEmail_usuario(email_usuario);
        objUsuariodto.setSenha_usuario(criptografarSenha(senha_usuario));

        UsuarioDAO objUsuariodao = new UsuarioDAO();
        objUsuariodao.CadastrarUsuario(objUsuariodto);
    }

    //Criptografia da senha no padrão SHA-256
    public static String criptografarSenha(String senha_usuario) {
        String cript = senha_usuario;
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
            BigInteger hash = new BigInteger(1, md.digest(senha_usuario.getBytes()));
            cript = hash.toString(24);
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("erro ao criptografar senha");
        }
        return cript;
    }

    //Butão cadastrar na tela de cadastro que retorna para tela de login
    public static void CadastrarJButtonActionPerformed() {
        JframeTelaLogin janelaJframeTelaLogin = new JframeTelaLogin();
        janelaJframeTelaLogin.setVisible(false);
    }
    
    //Butão sair na tela de cadastro 
    //Esse metodo está com erro
    public static void SairJButtonActionPerformed() {
        JframeTelaLogin janelaJframeTelaLogin = new JframeTelaLogin();
        janelaJframeTelaLogin.setVisible(true);
    }

}
