package DTO;

public class UsuarioDTO {

    private String CPF_usuario;
    private String nome_usuario;
    private String email_usuario;
    private String senha_usuario;
    private String tipo_usuario;

    public UsuarioDTO(String CPF_usuario, String nome_usuario, String email_usuario, String senha_usuario) {
        this.CPF_usuario = CPF_usuario;
        this.nome_usuario = nome_usuario;
        this.email_usuario = email_usuario;
        this.senha_usuario = senha_usuario;
    }

    public UsuarioDTO() {
    }

    public String getCPF_usuario() {
        return CPF_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setCPF_usuario(String CPF_usuario) {
        this.CPF_usuario = CPF_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

}
