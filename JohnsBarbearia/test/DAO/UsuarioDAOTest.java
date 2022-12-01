package DAO;

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

        UsuarioDTO usuario = new UsuarioDTO(cpf,
                nome,
                Criptografia.criptografiaDaSenha(senha));

        doNothing().when(usuariodao).CadastrarUsuario(usuario);
        boolean validar_cpf = Validacoes.validarCPF(cpf);
        usuariodao.CadastrarUsuario(usuario);
        assertEquals(true, validar_cpf);
        assertEquals("196a500b9911174047387a15004a27a6661231b233"
                + "a904b457a99856833779928b67b2ab", usuario.getSenha_usuario());
        assertEquals(UsuarioDTO.class, usuario.getClass());
        verify(usuariodao, times(1)).CadastrarUsuario(usuario);
    }

    @Test
    public void DeveLancaMensagemDeErroCasoUsuarioTenteRealizarCadastroDuasVezes()
            throws NaoFoiPossivelCadastrarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            SQLException {

        UsuarioDTO usuario = new UsuarioDTO(cpf, nome, senha);
        doThrow(new NaoFoiPossivelCadastrarUsuarioException())
                .when(usuariodao).CadastrarUsuario(usuario);
        NaoFoiPossivelCadastrarUsuarioException exception
                = assertThrows(NaoFoiPossivelCadastrarUsuarioException.class,
                        () -> usuariodao.CadastrarUsuario(usuario));
        assertEquals("Usuario não Cadastrado", exception.getMessage());
    }

    @Test
    public void TesteParaVerificarAutenticacaoDoUsuario()
            throws NaoFoiPossivelAutenticarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoValidarCPFException,
            ErroAoCriptografaSenhaException {

        UsuarioDTO usuario = new UsuarioDTO(cpf,
                nome, Criptografia.criptografiaDaSenha(senha));
        when(usuariodao.AutenticaUsuario(usuario)).thenReturn(true);
        usuariodao.AutenticaUsuario(usuario);
        verify(usuariodao, times(1)).AutenticaUsuario(usuario);
    }

    @Test
    public void DeverRetornaErroCasoOUsuarioTenteAutenticarNoSistemaSemTerFeitoCadastro()
            throws NaoFoiPossivelAutenticarUsuarioException,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoValidarCPFException {

        UsuarioDTO usuario = new UsuarioDTO(cpf, nome, senha);
        when(usuariodao.AutenticaUsuario(usuario))
                .thenThrow(new NaoFoiPossivelAutenticarUsuarioException());
        NaoFoiPossivelAutenticarUsuarioException exception
                = assertThrows(NaoFoiPossivelAutenticarUsuarioException.class,
                        () -> usuariodao.AutenticaUsuario(usuario));
        assertEquals("Usuario não Cadastrado no sistema!", exception.getMessage());
        verify(usuariodao, times(1)).AutenticaUsuario(usuario);
    }

    @Test
    public void TesteParaValidarSeEstarSelecionandoCpfNoBancoDeDados()
            throws ErroAoValidarDadosExecption,
            NaoFoiPossivelEstabelecerConexaoComBDException,
            NaoFoiPossivelCadastrarUsuarioException,
            SQLException,
            ErroAoValidarCPFException,
            NaoFoiPossivelAutenticarUsuarioException {

        UsuarioDTO usuario = new UsuarioDTO(cpf, nome, senha);
        boolean verificar_cpf = Validacoes.validarCPF(cpf);
        usuariodao.CadastrarUsuario(usuario);
        when(usuariodao.VerificaCpfBD(usuario)).thenReturn(true);
        assertTrue(usuariodao.VerificaCpfBD(usuario));
        assertEquals(true, verificar_cpf);
        verify(usuariodao, times(1)).AutenticaUsuario(usuario);
    }

    @Test
    public void DevelancaMensagemDeErroCasoCpfDoUsuarioNaoEstejaCadastrado()
            throws ErroAoValidarDadosExecption,
            NaoFoiPossivelEstabelecerConexaoComBDException {

        UsuarioDTO usuario = new UsuarioDTO(cpf, nome, senha);
        when(usuariodao.VerificaCpfBD(usuario))
                .thenThrow(new ErroAoValidarDadosExecption());
        ErroAoValidarDadosExecption exception
                = assertThrows(ErroAoValidarDadosExecption.class,
                        () -> usuariodao.VerificaCpfBD(usuario));
        assertEquals("Erro ao validar dados", exception.getMessage());
        verify(usuariodao, times(1)).VerificaCpfBD(usuario);
    }
}
