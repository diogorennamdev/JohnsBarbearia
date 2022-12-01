package EXCEPTIONS;

public class ErroAoTentarExcluirAgendamentoException extends Exception {

    @Override
    public String getMessage() {
        return "Erro ao tentar excluir agendamento";
    }
}
