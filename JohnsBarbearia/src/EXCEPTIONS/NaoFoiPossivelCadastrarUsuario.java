
package EXCEPTIONS;


public class NaoFoiPossivelCadastrarUsuario extends Exception {

    
    @Override
    public String getMessage() {
        return "Usuario não Cadastrado";
    }
    
    
}
