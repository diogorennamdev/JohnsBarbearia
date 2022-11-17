
package Exceptions;


public class NaoFoiPossivelAutenticaUsuarioException extends Exception {

    @Override
    public String getMessage() {
        return "Usuario não Cadastrado no sistema!";
    }
}
