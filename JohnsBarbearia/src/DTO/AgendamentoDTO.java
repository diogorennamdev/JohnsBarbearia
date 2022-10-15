package DTO;

import java.util.Date;

public class AgendamentoDTO {

    private String nome_cliente;
    private Date data_agendamento;
    private String servico;
    private float valor_servico;

    public AgendamentoDTO(String nome_cliente, 
            Date data_agendamento, 
            String servico, 
            float valor_servico) {
        this.nome_cliente = nome_cliente;
        this.data_agendamento = data_agendamento;
        this.servico = servico;
        this.valor_servico = valor_servico;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public Date getData() {
        return data_agendamento;
    }

    public String getServico() {
        return servico;
    }

    public float getValor_servico() {
        return valor_servico;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public void setData(Date data_agendamento) {
        this.data_agendamento = data_agendamento;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public void setValor_servico(float valor_servico) {
        this.valor_servico = valor_servico;
    }

}
