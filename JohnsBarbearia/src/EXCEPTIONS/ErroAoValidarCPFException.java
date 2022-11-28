package EXCEPTIONS;

public class ErroAoValidarCPFException extends Exception {

    @Override
    public String getMessage() {
        return "Erro ao validar CPF";
    }
}
