package DTO;

import java.util.Objects;

public class UsuarioDTO {

    private String CPF_usuario;
    private String nome_usuario;
    private String senha_usuario;
    private String tipo_usuario;

    public UsuarioDTO(String CPF_usuario,
            String nome_usuario,
            String senha_usuario) {
        this.CPF_usuario = CPF_usuario;
        this.nome_usuario = nome_usuario;
        this.senha_usuario = senha_usuario;
    }

    public String getCPF_usuario() {
        return CPF_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
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

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public UsuarioDTO() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioDTO other = (UsuarioDTO) obj;
        if (!Objects.equals(this.CPF_usuario, other.CPF_usuario)) {
            return false;
        }
        if (!Objects.equals(this.nome_usuario, other.nome_usuario)) {
            return false;
        }
        if (!Objects.equals(this.senha_usuario, other.senha_usuario)) {
            return false;
        }
        return Objects.equals(this.tipo_usuario, other.tipo_usuario);
    }
}
