package DAO.INTEGRATION;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import EXCEPTIONS.ErroAoValidarCPF;
import EXCEPTIONS.ErroAoValidarDados;
import EXCEPTIONS.NaoFoiPossivelAutenticarUsuario;
import EXCEPTIONS.NaoFoiPossivelCadastrarUsuario;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBD;
import java.sql.SQLException;
import static org.mockito.Mockito.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioDAOTest {

    private final UsuarioDAO usuariodao = mock(UsuarioDAO.class);

    @Test
    public void TesteParaVerificarAutenticacaoDoUsuario()
            throws NaoFoiPossivelAutenticarUsuario,
            NaoFoiPossivelEstabelecerConexaoComBD,
            ErroAoValidarCPF {

        UsuarioDTO usuario = new UsuarioDTO("85412145478",
                "Diogo", "1234");
        when(usuariodao.autenticacaoUsuario(usuario)).thenReturn(true);
        assertTrue(usuariodao.autenticacaoUsuario(usuario));
        verify(usuariodao, times(1)).autenticacaoUsuario(usuario);
    }

    @Test
    public void DeverRetornaFalseCasoOUsuarioNaoExistaNoBanco()
            throws NaoFoiPossivelAutenticarUsuario,
            NaoFoiPossivelEstabelecerConexaoComBD,
            ErroAoValidarCPF {

        UsuarioDTO usuario = new UsuarioDTO("85412145478",
                "Diogo", "1234");
        when(usuariodao.autenticacaoUsuario(
                usuario)).thenReturn(false);
        assertFalse(usuariodao.autenticacaoUsuario(usuario));
        verify(usuariodao, times(1)
        ).autenticacaoUsuario(usuario);
    }

    @Test
    public void TesteParaVerificarSeEstarInserindoUsuario() throws
            NaoFoiPossivelCadastrarUsuario,
            NaoFoiPossivelEstabelecerConexaoComBD,
            SQLException {

        UsuarioDTO usuario = new UsuarioDTO("50623842904",
                "Diogo", "1234");
        doNothing().when(usuariodao).CadastrarUsuario(usuario);
        usuariodao.CadastrarUsuario(usuario);
        verify(usuariodao, times(1))
                .CadastrarUsuario(usuario);

    }

    @Test
    public void TesteParaVerificarValidacaoDedados()
            throws ErroAoValidarDados,
            NaoFoiPossivelEstabelecerConexaoComBD {
        
        UsuarioDTO usuario = new UsuarioDTO("345540503", "diogo", "1234");
        when(usuariodao.verificarDadosBDCpf(usuario)).thenReturn(true);
        assertTrue(usuariodao.verificarDadosBDCpf(usuario));
        verify(usuariodao, times(1)).verificarDadosBDCpf(usuario);
    }

    @Test
    public void TesteParaverificarValidacaoDeDadosFalse()
            throws ErroAoValidarDados,
            NaoFoiPossivelEstabelecerConexaoComBD {
        
        UsuarioDTO usuario = new UsuarioDTO("345540503", "diogo", "1234");
        when(usuariodao.verificarDadosBDCpf(usuario)).thenReturn(false);
        assertFalse(usuariodao.verificarDadosBDCpf(usuario));
        verify(usuariodao, times(1)).verificarDadosBDCpf(usuario);
    }

   
}
