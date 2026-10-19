package br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades;

public class QuantidadeConcluintesRede {
    private Integer idQuantidadeConcluintesRede;
    private Integer redePublica;
    private Integer redePrivada;
    private Integer fkInfoConcluintes;

    public QuantidadeConcluintesRede(Integer idQuantidadeConcluintesRede, Integer redePublica, Integer redePrivada, Integer fkInfoConcluintes) {
        this.idQuantidadeConcluintesRede = idQuantidadeConcluintesRede;
        this.redePublica = redePublica;
        this.redePrivada = redePrivada;
        this.fkInfoConcluintes = fkInfoConcluintes;
    }

    public Integer getIdQuantidadeConcluintesRede() {
        return idQuantidadeConcluintesRede;
    }

    public void setIdQuantidadeConcluintesRede(Integer idQuantidadeConcluintesRede) {
        this.idQuantidadeConcluintesRede = idQuantidadeConcluintesRede;
    }

    public Integer getRedePublica() {
        return redePublica;
    }

    public void setRedePublica(Integer redePublica) {
        this.redePublica = redePublica;
    }

    public Integer getRedePrivada() {
        return redePrivada;
    }

    public void setRedePrivada(Integer redePrivada) {
        this.redePrivada = redePrivada;
    }

    public Integer getFkInfoConcluintes() {
        return fkInfoConcluintes;
    }

    public void setFkInfoConcluintes(Integer fkInfoConcluintes) {
        this.fkInfoConcluintes = fkInfoConcluintes;
    }
}
