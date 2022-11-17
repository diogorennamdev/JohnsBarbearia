package CONTROLS;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import Exceptions.NaoFoiPossivelAutenticaUsuarioException;
import Exceptions.NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException;
import HELPERS.ChamarTelas;
import HELPERS.Criptografia;
import javax.swing.JOptionPane;

public class ControlTelaLogin {

    public static boolean entrarSistema(String CPF_usuario,
            String senha_usuario) throws NaoFoiPossivelAutenticaUsuarioException, NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException {

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

    public static boolean validarDadosLogin(String CPF_usuario,
            String senha_usuario) throws NaoFoiPossivelAutenticaUsuarioException, NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException {
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

}
