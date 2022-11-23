package CONTROLS;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import EXCEPTIONS.NaoFoiPossivelAutenticaUsuario;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBD;
import HELPERS.ChamarTelas;
import HELPERS.Criptografia;
import java.util.HashMap;

public class ControlTelaLogin {

    public static boolean entrarSistema(String CPF_usuario,
            String senha_usuario)
            throws NaoFoiPossivelAutenticaUsuario,
            NaoFoiPossivelEstabelecerConexaoComBD {

        UsuarioDTO objUsuariodto = new UsuarioDTO();
        objUsuariodto.setCPF_usuario(CPF_usuario);
        objUsuariodto.setSenha_usuario(
                Criptografia.criptografiaDaSenha(senha_usuario));

        UsuarioDAO objUsuariodao = new UsuarioDAO();
        objUsuariodao.autenticacaoUsuario(objUsuariodto);

        boolean fechartela = false;
        if (objUsuariodao.autenticacaoUsuario(objUsuariodto)) {
            ChamarTelas.chamarTelaAgendamento();
            fechartela = true;
        }
        return fechartela;

    }

<<<<<<< HEAD
    public static String validarDadosLogin(String CPF_usuario,
=======
    public static HashMap<String, String> validarDadosLogin(String CPF_usuario,
>>>>>>> 9e0fe949a73c48323b9245a9bc4069caa4a88df4
            String senha_usuario)
            throws NaoFoiPossivelAutenticaUsuario,
            NaoFoiPossivelEstabelecerConexaoComBD {

<<<<<<< HEAD
        String response;

        if (CPF_usuario.equals("") || senha_usuario.equals("")) {
            response = "CAMPOS VAZIOS!\n Por favor insira os dados.";

        } else if (ControlTelaLogin.entrarSistema(CPF_usuario, senha_usuario)) {
            response = null;

        } else {
            response = " USUÁRIO NÃO CADASTRADO!\n Por favor tente novamente.";
=======
        HashMap<String, String> response = new HashMap<>();

        if (CPF_usuario.equals("") || senha_usuario.equals("")) {
            response.put("Resposta", "CAMPOS VAZIOS!\n Por favor insira os dados.");
            

        } else if (ControlTelaLogin.entrarSistema(CPF_usuario, senha_usuario)) {
            response.put("Resposta", "");
        } else {
            response.put("Resposta",
                    " USUÁRIO NÃO CADASTRADO!\n Por favor tente novamente.");
>>>>>>> 9e0fe949a73c48323b9245a9bc4069caa4a88df4

        }

        return response;

    }

}
