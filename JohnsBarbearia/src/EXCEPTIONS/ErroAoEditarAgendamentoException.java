package EXCEPTIONS;

public class ErroAoEditarAgendamentoException extends Exception {

    @Override
    public String getMessage() {
        return "Erro ao Tentar Editar Agendamento";
    }

}
