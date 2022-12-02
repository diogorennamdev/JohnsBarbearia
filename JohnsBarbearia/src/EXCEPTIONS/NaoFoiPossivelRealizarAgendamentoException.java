package EXCEPTIONS;

public class NaoFoiPossivelRealizarAgendamentoException extends Exception {

    @Override
    public String getMessage() {
        return "Não foi possivel realizar agendamento";
    }
}
