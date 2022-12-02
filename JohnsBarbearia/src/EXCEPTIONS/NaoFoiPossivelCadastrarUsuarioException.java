package EXCEPTIONS;

public class NaoFoiPossivelCadastrarUsuarioException extends Exception {

    @Override
    public String getMessage() {
        return "Usuario não Cadastrado";
    }
}
