package EXCEPTIONS;

public class NaoFoiPossivelAutenticaUsuario extends Exception {

    @Override
    public String getMessage() {
        return "Usuario não Cadastrado no sistema!";
    }

}
