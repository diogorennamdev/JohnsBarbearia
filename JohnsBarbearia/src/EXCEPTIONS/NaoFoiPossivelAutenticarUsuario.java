package EXCEPTIONS;

public class NaoFoiPossivelAutenticarUsuario extends Exception {

    @Override
    public String getMessage() {
        return "Usuario não Cadastrado no sistema!";
    }

}
