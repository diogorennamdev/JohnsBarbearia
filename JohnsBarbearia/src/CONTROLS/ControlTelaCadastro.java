package CONTROLS;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import EXCEPTIONS.ErroAoCriptografaSenhaException;
import EXCEPTIONS.ErroAoValidarCPFException;
import EXCEPTIONS.ErroAoValidarDadosExecption;
import EXCEPTIONS.NaoFoiPossivelAutenticarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelCadastrarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBDException;
import HELPERS.ChamarTelas;
import HELPERS.Criptografia;
import HELPERS.Validacoes;
import java.sql.SQLException;

public class ControlTelaCadastro {

    public static boolean cadastrar(String CPF_usuario,
            String nome_usuario,
            String senha_usuario)
            throws NaoFoiPossivelCadastrarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            SQLException,
            NaoFoiPossivelAutenticarUsuarioException,
            ErroAoCriptografaSenhaException {

        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        objUsuarioDTO.setCPF_usuario(CPF_usuario);
        objUsuarioDTO.setNome_usuario(nome_usuario);
        objUsuarioDTO.setSenha_usuario(
                Criptografia.criptografiaDaSenha(senha_usuario));

        UsuarioDAO objUsuarioDAO = new UsuarioDAO();
        objUsuarioDAO.CadastrarUsuario(objUsuarioDTO);
        boolean fechartela = false;

        if (objUsuarioDAO.autenticacaoUsuario(objUsuarioDTO)) {
            ChamarTelas.chamarTelaLogin();
            fechartela = true;
        }
        return fechartela;

    }

    public static String autenticaDados(String CPF_usuario,
            String nome_usuario,
            String senha_usuario)
            throws ErroAoValidarDadosExecption,
            NaoFoiPossivelCadastrarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            SQLException,
            ErroAoValidarCPFException,
            NaoFoiPossivelAutenticarUsuarioException,
            ErroAoCriptografaSenhaException {

        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        objUsuarioDTO.setCPF_usuario(CPF_usuario);

        UsuarioDAO objUsuariodao = new UsuarioDAO();
        objUsuariodao.verificarDadosBDCpf(objUsuarioDTO);

        String response = null;
        if (CPF_usuario.equals("")
                || nome_usuario.equals("")
                || senha_usuario.equals("")) {
            response = "CAMPOS VAZIOS!\n Por favor insira os dados";

        } else if (objUsuariodao.verificarDadosBDCpf(objUsuarioDTO) == true) {
            response = "CPF JÁ CADASTRADO!\n Por favor tente novamente!";

        } else if (Validacoes.validarCPF(CPF_usuario) == false) {
            response = "ERRO, CPF INVÁLIDO!\n";

        } else if (Validacoes.validarCPF(CPF_usuario) == true) {
            ControlTelaCadastro.cadastrar(CPF_usuario, nome_usuario, senha_usuario);

        }
        return response;
    }
}
