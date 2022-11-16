package DTO;

import java.sql.Time;
import java.util.Date;

public class AgendarDTO {

    private String nome_cliente;
    private String servico;
    private float valor_servico;
    private Date data_agendamento;
    private Time hora_agendamento;
    private String observacao_agendamento;

    public AgendarDTO(String nome_cliente,
            String servico,
            float valor_servico,
            Date data_agendamento,
            Time hora_agendamento,
            String observacao_agendamento) {
        this.nome_cliente = nome_cliente;
        this.servico = servico;
        this.valor_servico = valor_servico;
        this.data_agendamento = data_agendamento;
        this.hora_agendamento = hora_agendamento;
        this.observacao_agendamento = observacao_agendamento;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public String getServico() {
        return servico;
    }

    public float getValor_servico() {
        return valor_servico;
    }

    public Date getData_agendamento() {
        return data_agendamento;
    }

    public Time getHora_agendamento() {
        return hora_agendamento;
    }

    public String getObservacao_agendamento() {
        return observacao_agendamento;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public void setValor_servico(float valor_servico) {
        this.valor_servico = valor_servico;
    }

    public void setData_agendamento(Date data_agendamento) {
        this.data_agendamento = data_agendamento;
    }

    public void setHora_agendamento(Time hora_agendamento) {
        this.hora_agendamento = hora_agendamento;
    }

    public void setObservacao_agendamento(String observacao_agendamento) {
        this.observacao_agendamento = observacao_agendamento;
    }

}
