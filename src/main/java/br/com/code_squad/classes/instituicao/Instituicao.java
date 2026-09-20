package br.com.code_squad.classes.instituicao;

public class Instituicao {
    private Integer idInstituicao;
    private String nome;
    private String logo;
    private String cnpj;
    private String uf;
    private String cidade;

    public Instituicao(Integer idInstituicao, String nome, String logo,
                       String cnpj, String uf, String cidade) {

        this.idInstituicao = idInstituicao;
        this.nome = nome;
        this.logo = logo;
        this.cnpj = cnpj;
        this.uf = uf;
        this.cidade = cidade;
    }

    public Integer getIdInstituicao() {
        return idInstituicao;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getUf() {
        return uf;
    }

    public String getCidade() {
        return cidade;
    }

    public String getLogo() {
        return logo;
    }
}
