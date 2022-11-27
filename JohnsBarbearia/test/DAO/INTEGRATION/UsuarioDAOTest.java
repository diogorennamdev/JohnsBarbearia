package DAO.INTEGRATION;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import EXCEPTIONS.ErroAoCriptografaSenhaException;
import EXCEPTIONS.ErroAoValidarCPFException;
import EXCEPTIONS.ErroAoValidarDadosExecption;
import EXCEPTIONS.NaoFoiPossivelAutenticarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelCadastrarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBDException;
import HELPERS.Criptografia;
import HELPERS.Validacoes;
import java.sql.SQLException;
import static org.mockito.Mockito.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class UsuarioDAOTest {

    private final UsuarioDAO usuariodao = mock(UsuarioDAO.class);
  

    @Test
    public void TesteParaVerificarSeEstarInserindoUsuario()
            throws NaoFoiPossivelCadastrarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            SQLException,
            ErroAoValidarCPFException,
            ErroAoCriptografaSenhaException {

        String cpf = "60130154490", nome = "Diogo", senha = "1234";
        UsuarioDTO usuario = new UsuarioDTO(cpf, nome, Criptografia.criptografiaDaSenha(senha));

        doNothing().when(usuariodao).CadastrarUsuario(usuario);
        assertTrue(Validacoes.validarCPF(cpf));
        usuariodao.CadastrarUsuario(usuario);
        verify(usuariodao, times(1)).CadastrarUsuario(usuario);

    }

    @Test
    public void TesteParaVerificarAutenticacaoDoUsuario()
            throws NaoFoiPossivelAutenticarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoValidarCPFException,
            ErroAoCriptografaSenhaException {
        String cpf = "60130154490", nome = "Diogo", senha = "1234";
        UsuarioDTO usuario = new UsuarioDTO(cpf, nome, Criptografia.criptografiaDaSenha(senha));
     
        when(usuariodao.autenticacaoUsuario(usuario)).thenReturn(true);
        usuariodao.autenticacaoUsuario(usuario);
        verify(usuariodao, times(1)).autenticacaoUsuario(usuario);
    }

    @Test
    public void DeverRetornaErroCasoOUsuarioNaoExistaNoBanco()
            throws NaoFoiPossivelAutenticarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoValidarCPFException {

        UsuarioDTO usuario = new UsuarioDTO("85412145478", "Diogo", "1234");
       // when(usuariodao.autenticacaoUsuario(usuario)).thenThrow
       // (new NaoFoiPossivelAutenticarUsuario()); 
        
        when(usuariodao.autenticacaoUsuario(usuario))
                .thenThrow(new NaoFoiPossivelAutenticarUsuarioException()); 
        NaoFoiPossivelAutenticarUsuarioException exception = assertThrows(NaoFoiPossivelAutenticarUsuarioException.class,
                ()-> usuariodao.autenticacaoUsuario(usuario));
        assertEquals("Usuario não Cadastrado no sistema!", exception.getMessage());
       // assertFalse(usuariodao.autenticacaoUsuario(usuario));
        verify(usuariodao, times(1)).autenticacaoUsuario(usuario);
    }

    @Test
    public void TesteParaVerificarValidacaoDedados()
            throws ErroAoValidarDadosExecption,
            NaoFoiPossivelEstabelecerConexaoComBDException {

        UsuarioDTO usuario = new UsuarioDTO("345540503", "diogo", "1234");
        when(usuariodao.verificarDadosBDCpf(usuario)).thenReturn(true);
        assertTrue(usuariodao.verificarDadosBDCpf(usuario));
        verify(usuariodao, times(1)).verificarDadosBDCpf(usuario);
    }

    @Test
    public void TesteParaverificarValidacaoDeDadosFalse()
            throws ErroAoValidarDadosExecption,
            NaoFoiPossivelEstabelecerConexaoComBDException {

        UsuarioDTO usuario = new UsuarioDTO("345540503", "diogo", "1234");
        when(usuariodao.verificarDadosBDCpf(usuario)).thenReturn(false);
        assertFalse(usuariodao.verificarDadosBDCpf(usuario));
        verify(usuariodao, times(1)).verificarDadosBDCpf(usuario);
    }

//    @Test
//    public void TesteParaVerificarSeRetornaErroNaConexaoComObanco()
//            throws NaoFoiPossivelEstabelecerConexaoComBD {
//
//       UsuarioDTO usuario = mock(UsuarioDTO.class);
//        Mockito.doThrow(new NaoFoiPossivelEstabelecerConexaoComBD())
//                .when(conexaoDAO).conectaBD();
//        ExpectedException.expectMessage(NaoFoiPossivelEstabelecerConexaoComBD.class);
//        expectedException.expectMessage("Não foi possível estabelecer conexão com o banco de dados.\n Tente novamente mais tarde!");
//        given(usuarioDAO.autenticarUsuario(user)).willThrow(new NaoFoiPossivelEstabelecerConexaoComOBancoDeDadosException());
//    }
}
