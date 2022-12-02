package EXCEPTIONS;

public class ErroAoTentarLimpaAgendaException extends Exception {

    @Override
    public String getMessage() {
        return "Erro ao tentar Limpar Agenda";
    }
}
