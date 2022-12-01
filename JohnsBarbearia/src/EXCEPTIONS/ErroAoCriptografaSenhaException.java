package EXCEPTIONS;

public class ErroAoCriptografaSenhaException extends Exception {

    @Override
    public String getMessage() {
        return "Erro ao validar criptografa senha";
    }

}
