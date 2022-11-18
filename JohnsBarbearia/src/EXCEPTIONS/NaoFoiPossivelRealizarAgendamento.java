package EXCEPTIONS;

public class NaoFoiPossivelRealizarAgendamento extends Exception {

    @Override
    public String getMessage() {
        return "Não foi possivel realizar agendamento";
    }

}
