package model;

public class Endereço {

    private String nomeDaRua;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereço(String nomeDaRua, String bairro, String cidade, String uf) {
        this.nomeDaRua = nomeDaRua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
