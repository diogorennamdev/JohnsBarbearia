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
   

    //Criando Novo usuario
    String cpf = "60130154490", nome = "Diogo", senha = "123";

    @Test
    public void TesteParaVerificarSeEstarInserindoUsuario()
            throws NaoFoiPossivelCadastrarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            SQLException,
            ErroAoValidarCPFException,
            ErroAoCriptografaSenhaException {

        UsuarioDTO usuario = new UsuarioDTO(cpf, nome, Criptografia.criptografiaDaSenha(senha));

        doNothing().when(usuariodao).CadastrarUsuario(usuario);
        boolean validar_cpf = Validacoes.validarCPF(cpf);
        usuariodao.CadastrarUsuario(usuario);
        assertEquals(true, validar_cpf);
        assertEquals("196a500b9911174047387a15004a27a6661231b233a904b457a9985683"
                + "3779928b67b2ab", usuario.getSenha_usuario());
        assertEquals(UsuarioDTO.class, usuario.getClass());
        verify(usuariodao, times(1)).CadastrarUsuario(usuario);
      
    }

    @Test
    public void DeveLancaMensagemDeErroCasoUsuarioTenteRealizarCadastroDuasVezes()
            throws NaoFoiPossivelCadastrarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException, SQLException {
        
        UsuarioDTO usuario = new UsuarioDTO(cpf, nome, senha);
        doThrow(new NaoFoiPossivelCadastrarUsuarioException())
                .when(usuariodao).CadastrarUsuario(usuario);
        NaoFoiPossivelCadastrarUsuarioException exception = assertThrows(NaoFoiPossivelCadastrarUsuarioException.class,
                () -> usuariodao.CadastrarUsuario(usuario));
        assertEquals("Usuario não Cadastrado", exception.getMessage());

    }

    @Test
    public void TesteParaVerificarAutenticacaoDoUsuario()
            throws NaoFoiPossivelAutenticarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoValidarCPFException,
            ErroAoCriptografaSenhaException {

        UsuarioDTO usuario = new UsuarioDTO(cpf, nome, Criptografia.criptografiaDaSenha(senha));
        when(usuariodao.autenticacaoUsuario(usuario)).thenReturn(true);
        usuariodao.autenticacaoUsuario(usuario);
        verify(usuariodao, times(1)).autenticacaoUsuario(usuario);
    }

    @Test
    public void DeverRetornaErroCasoOUsuarioTenteAutenticarNoSistemaSemTerFeitoCadastro()
            throws NaoFoiPossivelAutenticarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoValidarCPFException {

        UsuarioDTO usuario = new UsuarioDTO(cpf, nome, senha);
        when(usuariodao.autenticacaoUsuario(usuario))
                .thenThrow(new NaoFoiPossivelAutenticarUsuarioException());
        NaoFoiPossivelAutenticarUsuarioException exception
                = assertThrows(NaoFoiPossivelAutenticarUsuarioException.class,
                        () -> usuariodao.autenticacaoUsuario(usuario));
        assertEquals("Usuario não Cadastrado no sistema!", exception.getMessage());
        verify(usuariodao, times(1)).autenticacaoUsuario(usuario);
    }

    @Test
    public void TesteParaValidarSeEstarSelecionandoCpfNoBancoDeDados()
            throws ErroAoValidarDadosExecption,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            NaoFoiPossivelCadastrarUsuarioException,
            SQLException,
            ErroAoValidarCPFException {

        UsuarioDTO usuario = new UsuarioDTO(cpf, nome, senha);
        boolean verificar_cpf = Validacoes.validarCPF(cpf);
        usuariodao.CadastrarUsuario(usuario);
        when(usuariodao.verificarDadosBDCpf(usuario)).thenReturn(true);
        assertTrue(usuariodao.verificarDadosBDCpf(usuario));
        assertEquals(true, verificar_cpf);
        verify(usuariodao, times(1)).verificarDadosBDCpf(usuario);
    }

    @Test
    public void DevelancaMensagemDeErroCasoCpfDoUsuarioNaoEstejaCadastrado()
            throws ErroAoValidarDadosExecption,
            NaoFoiPossivelEstabelecerConexaoComBDException {

        UsuarioDTO usuario = new UsuarioDTO(cpf, nome, senha);
        when(usuariodao.verificarDadosBDCpf(usuario))
                .thenThrow(new ErroAoValidarDadosExecption());
        ErroAoValidarDadosExecption exception = assertThrows(ErroAoValidarDadosExecption.class,
                () -> usuariodao.verificarDadosBDCpf(usuario));
        assertEquals("Erro ao validar dados", exception.getMessage());
        verify(usuariodao, times(1)).verificarDadosBDCpf(usuario);
    }



}
