package CONTROLS;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import HELPERS.Criptografia;
import HELPERS.Validacoes;
import VIEW.JframeTelaLogin;
import javax.swing.JOptionPane;

public class ControlTelaCadastro {

    public static void cadastrar(String CPF_usuario,
            String nome_usuario,
            String senha_usuario) {

        UsuarioDTO objUsuariodto = new UsuarioDTO();
        objUsuariodto.setCPF_usuario(CPF_usuario);
        objUsuariodto.setNome_usuario(nome_usuario);
        objUsuariodto.setSenha_usuario(
                Criptografia.criptografiaDaSenha(senha_usuario));

        UsuarioDAO objUsuariodao = new UsuarioDAO();
        objUsuariodao.CadastrarUsuario(objUsuariodto);

    }

    public static void autenticaDadosBD(String CPF_usuario,
            String nome_usuario,
            String senha_usuario) {

        UsuarioDTO objUsuariodto = new UsuarioDTO();
        objUsuariodto.setCPF_usuario(CPF_usuario);

        UsuarioDAO objUsuariodao = new UsuarioDAO();
        objUsuariodao.verificarDadosBDCpf(objUsuariodto);

        if (objUsuariodao.verificarDadosBDCpf(objUsuariodto) == true) {
            JOptionPane.showMessageDialog(null, " CPF JÁ CADASTRADO!\n Por favor tente novamente!");
//        } else {
//            cadastrar(CPF_usuario, nome_usuario, senha_usuario); 
        }
    }

    public static boolean ValidarDadosCPF(String CPF_usuario,
            String nome_usuario, String senha_usuario) {

        if (CPF_usuario.equals("")
                || nome_usuario.equals("")
                || senha_usuario.equals("")) {
            JOptionPane.showMessageDialog(null,
                    " CAMPOS VAZIOS!\n Por favor insira os dados");
            return false;
        } else if (Validacoes.validarCPF(CPF_usuario) == true) {
            ControlTelaCadastro.autenticaDadosBD(CPF_usuario,
                    nome_usuario,
                    senha_usuario);
            return true;
        } else if (Validacoes.validarCPF(CPF_usuario) == false) {
            JOptionPane.showMessageDialog(null,
                    "ERRO, CPF INVÁLIDO!\n");
            return false;
        }
        return false;
    }

    //Metodo que retorna JframeTelaLogin
    public static void chamarTelaLogin() {
        JframeTelaLogin janelaJframeTelaLogin = new JframeTelaLogin();
        janelaJframeTelaLogin.setVisible(true);
    }

}
