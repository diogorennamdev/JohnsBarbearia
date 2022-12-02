package EXCEPTIONS;

public class ErroAoListarDadosException extends Exception {

    @Override
    public String getMessage() {
        return "Erro ao Listar Dados";
    }
}
