package CONTROLS;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import EXCEPTIONS.ErroAoValidarCPF;
import EXCEPTIONS.ErroAoValidarDados;
import EXCEPTIONS.NaoFoiPossivelCadastrarUsuario;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBD;
import HELPERS.ChamarTelas;
import HELPERS.Criptografia;
import HELPERS.Validacoes;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControlTelaCadastro {

    public static void cadastrar(String CPF_usuario,
            String nome_usuario,
            String senha_usuario)
            throws NaoFoiPossivelCadastrarUsuario,
            NaoFoiPossivelEstabelecerConexaoComBD,
            SQLException {

        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        objUsuarioDTO.setCPF_usuario(CPF_usuario);
        objUsuarioDTO.setNome_usuario(nome_usuario);
        objUsuarioDTO.setSenha_usuario(
                Criptografia.criptografiaDaSenha(senha_usuario));

        UsuarioDAO objUsuarioDAO = new UsuarioDAO();
        objUsuarioDAO.CadastrarUsuario(objUsuarioDTO);

    }

    public static void autenticaDadosBD(String CPF_usuario,
            String nome_usuario,
            String senha_usuario)
            throws ErroAoValidarDados,
            NaoFoiPossivelCadastrarUsuario,
            NaoFoiPossivelEstabelecerConexaoComBD,
            SQLException {

        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        objUsuarioDTO.setCPF_usuario(CPF_usuario);

        UsuarioDAO objUsuariodao = new UsuarioDAO();
        objUsuariodao.verificarDadosBDCpf(objUsuarioDTO);

        if (objUsuariodao.verificarDadosBDCpf(objUsuarioDTO) == true) {
            JOptionPane.showMessageDialog(null,
                    " CPF JÁ CADASTRADO!\n Por favor tente novamente!");
            ChamarTelas.chamarTelaCadastro();
        } else {
            cadastrar(CPF_usuario, nome_usuario, senha_usuario);
            ChamarTelas.chamarTelaLogin();
        }
    }

    public static String ValidarDadosCPF(String CPF_usuario,
            String nome_usuario, String senha_usuario)
            throws ErroAoValidarCPF,
            ErroAoValidarDados,
            NaoFoiPossivelCadastrarUsuario,
            NaoFoiPossivelEstabelecerConexaoComBD,
            SQLException {
        
        String response = null;
        if (CPF_usuario.equals("")
                || nome_usuario.equals("")
                || senha_usuario.equals("")) {
            response = " CAMPOS VAZIOS!\n Por favor insira os dados";

        } else if (Validacoes.validarCPF(CPF_usuario) == true) {
            ControlTelaCadastro.autenticaDadosBD(CPF_usuario,
                    nome_usuario,
                    senha_usuario);
//            response = null;
            
        } else if (Validacoes.validarCPF(CPF_usuario) == false) {
             response = "ERRO, CPF INVÁLIDO!\n";
            
        }
        return response;

        }

    }
