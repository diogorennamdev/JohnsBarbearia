package DTO;

public class UsuarioDTO {

    public static void main(String[] args) {

    }
    private String nome;
    private String email;
    private String tipo;
    private int id;
    private String senha;

    public UsuarioDTO(String nome, String email, String tipo, int id, String senha) {
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
        this.id = id;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }

    public String getsenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
