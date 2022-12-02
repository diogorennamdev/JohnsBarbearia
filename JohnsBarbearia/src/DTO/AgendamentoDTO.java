package DTO;

public class AgendamentoDTO {

    private int ID_agendamento;
    private String nome_cliente;
    private String servico;
    private String valor_servico;
    private String data_agendamento;
    private String hora_agendamento;
    private String observacao_agendamento;

    public AgendamentoDTO(int ID_agendamento,
            String nome_cliente,
            String servico,
            String valor_servico,
            String data_agendamento,
            String hora_agendamento,
            String observacao_agendamento) {
        this.ID_agendamento = ID_agendamento;
        this.nome_cliente = nome_cliente;
        this.servico = servico;
        this.valor_servico = valor_servico;
        this.data_agendamento = data_agendamento;
        this.hora_agendamento = hora_agendamento;
        this.observacao_agendamento = observacao_agendamento;
    }

    public int getID_agendamento() {
        return ID_agendamento;
    }

    public void setID_agendamento(int ID_agendamento) {
        this.ID_agendamento = ID_agendamento;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getValor_servico() {
        return valor_servico;
    }

    public void setValor_servico(String valor_servico) {
        this.valor_servico = valor_servico;
    }

    public String getData_agendamento() {
        return data_agendamento;
    }

    public void setData_agendamento(String data_agendamento) {
        this.data_agendamento = data_agendamento;
    }

    public String getHora_agendamento() {
        return hora_agendamento;
    }

    public void setHora_agendamento(String hora_agendamento) {
        this.hora_agendamento = hora_agendamento;
    }

    public String getObservacao_agendamento() {
        return observacao_agendamento;
    }

    public void setObservacao_agendamento(String observacao_agendamento) {
        this.observacao_agendamento = observacao_agendamento;
    }

    public void add(AgendamentoDTO agendamento) {
    }

    public AgendamentoDTO() {
    }
}
