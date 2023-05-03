package model;

public class Endereço {

    private String nomeDaRua;
    private String nomeDoBairro;
    private String nomeDaCidade;
    private String uf;

    public Endereço(String nomeDaRua, String nomeDoBairro, String nomeDaCidade, String uf) {
        this.nomeDaRua = nomeDaRua;
        this.nomeDoBairro = nomeDoBairro;
        this.nomeDaCidade = nomeDaCidade;
        this.uf = uf;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public String getnomeDoBairro() {
        return nomeDoBairro;
    }

    public void setnomeDoBairro(String nomeDoBairro) {
        this.nomeDoBairro = nomeDoBairro;
    }

    public String getnomeDaCidade() {
        return nomeDaCidade;
    }

    public void setnomeDaCidade(String nomeDaCidade) {
        this.nomeDaCidade = nomeDaCidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
