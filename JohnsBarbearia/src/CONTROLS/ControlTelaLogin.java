package CONTROLS;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import EXCEPTIONS.ErroAoCriptografaSenhaException;
import EXCEPTIONS.ErroAoListarDadosException;
import EXCEPTIONS.NaoFoiPossivelAutenticarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBDException;
import HELPERS.ChamarTelas;
import HELPERS.Criptografia;

public class ControlTelaLogin {

    public static boolean EntrarSistema(String CPF_usuario,
            String senha_usuario)
            throws NaoFoiPossivelAutenticarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoCriptografaSenhaException,
            ErroAoListarDadosException {

        UsuarioDTO objUsuariodto = new UsuarioDTO();
        objUsuariodto.setCPF_usuario(CPF_usuario);
        objUsuariodto.setSenha_usuario(
                Criptografia.criptografiaDaSenha(senha_usuario));

        UsuarioDAO objUsuariodao = new UsuarioDAO();
        objUsuariodao.AutenticaUsuario(objUsuariodto);

        boolean fechartela = false;
        if (objUsuariodao.AutenticaUsuario(objUsuariodto)) {
            ChamarTelas.chamarTelaAgendamento();
            fechartela = true;
        }
        return fechartela;
    }

    public static String ValidarDadosLogin(String CPF_usuario,
            String senha_usuario)
            throws NaoFoiPossivelAutenticarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoCriptografaSenhaException,
            ErroAoListarDadosException {

        String response;

        if (CPF_usuario.equals("") || senha_usuario.equals("")) {
            response = "CAMPOS VAZIOS!\n Por favor insira os dados.";

        } else if (ControlTelaLogin.EntrarSistema(CPF_usuario, senha_usuario)) {
            response = null;

        } else {
            response = "USUÁRIO NÃO CADASTRADO!\n Por favor tente novamente.";
        }
        return response;
    }
}
