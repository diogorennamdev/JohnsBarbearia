
package DAO;

import DTO.UsuarioDTO;
import org.junit.Test;
import static org.junit.Assert.*;


public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
    }

    @Test
    public void testAutenticacaoUsuario() {
    }

    @Test
    public void testCadastrarUsuario() {
        UsuarioDTO usuario = new UsuarioDTO("45767987",
                "Diogo", "diogo@gmail.com", "1234");
       
        UsuarioDAO usuariodao = new UsuarioDAO();
        usuariodao.CadastrarUsuario(usuario);
    }
    
}
