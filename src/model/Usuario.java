package model;

public class Usuario {

        private String nome;
        private String cpf;
        private Endereço endereço;
        private long idUsuario;
        private static long ultimoIdUsuario;

    public Usuario(String nome, String cpf, Endereço endereço) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereço = endereço;
    }

    public long getIdUsuario() {
        ultimoIdUsuario++;
        idUsuario = ultimoIdUsuario;
        return this.idUsuario;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }
}
