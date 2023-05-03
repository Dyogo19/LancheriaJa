package model;

public class Usuario {

    private String nomeUsuario;
    private String cpfUsurio;
    private Endereço endereço;
    private long idUsuario;
    private static long ultimoIdUsuario;

    public Usuario(String nomeUsuario, String cpfUsurio, Endereço endereço) {
        this.nomeUsuario = nomeUsuario;
        this.cpfUsurio = cpfUsurio;
        this.endereço = endereço;
    }

    public long getIdUsuario() {
        ultimoIdUsuario++;
        idUsuario = ultimoIdUsuario;
        return this.idUsuario;

    }

    public String getnomeUsuario() {
        return nomeUsuario;
    }

    public void setnomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getcpfUsurio() {
        return cpfUsurio;
    }

    public void setcpfUsurio(String cpf) {
        this.cpfUsurio = cpfUsurio;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }
}
