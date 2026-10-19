package br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades;

public class QuantidadeMatriculasRede {
    private Integer idQuantidadeMatriculasRede;
    private Integer redePublica;
    private Integer redePrivada;
    private Integer fkInfoMatriculas;

    public QuantidadeMatriculasRede(Integer idQuantidadeMatriculasRede, Integer redePublica, Integer redePrivada, Integer fkInfoMatriculas) {
        this.idQuantidadeMatriculasRede = idQuantidadeMatriculasRede;
        this.redePublica = redePublica;
        this.redePrivada = redePrivada;
        this.fkInfoMatriculas = fkInfoMatriculas;
    }

    public Integer getIdQuantidadeMatriculasRede() {
        return idQuantidadeMatriculasRede;
    }

    public void setIdQuantidadeMatriculasRede(Integer idQuantidadeMatriculasRede) {
        this.idQuantidadeMatriculasRede = idQuantidadeMatriculasRede;
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

    public Integer getFkInfoMatriculas() {
        return fkInfoMatriculas;
    }

    public void setFkInfoMatriculas(Integer fkInfoMatriculas) {
        this.fkInfoMatriculas = fkInfoMatriculas;
    }
}
