package Exceptions;

public class NaoFoiPossivelRealizarAgendamentoExecption extends Exception {

    @Override
    public String getMessage() {
        return "Não foi possivel realizar agendamento";
    }

}
