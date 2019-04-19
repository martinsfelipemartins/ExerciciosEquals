package br.com.alunodh;

public class Pessoa {

    private String nome;
    private Integer RG;

    public Pessoa(String nome, Integer RG) {
        this.nome = nome;
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRG() {
        return RG;
    }

    public void setRG(Integer RG) {
        this.RG = RG;
    }

    @Override
    public boolean equals(Object outroPessoa) {
        if (((Pessoa) outroPessoa).getRG() == this.getRG()) {
            return true;

        }

return false;
    }

}
