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

    public static HashMap<String, String> validarDadosLogin(String CPF_usuario,
            String senha_usuario)
            throws NaoFoiPossivelAutenticaUsuario,
            NaoFoiPossivelEstabelecerConexaoComBD {

        HashMap<String, String> response = new HashMap<>();

        if (CPF_usuario.equals("") || senha_usuario.equals("")) {
            response.put("Resposta", "CAMPOS VAZIOS!\n Por favor insira os dados.");
            

        } else if (ControlTelaLogin.entrarSistema(CPF_usuario, senha_usuario)) {
            response.put("Resposta", "");
        } else {
            response.put("Resposta",
                    " USUÁRIO NÃO CADASTRADO!\n Por favor tente novamente.");

        }

        return response;

    }

}
