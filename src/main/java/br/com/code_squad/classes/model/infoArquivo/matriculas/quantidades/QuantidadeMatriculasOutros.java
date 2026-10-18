package br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades;

public class QuantidadeMatriculasOutros {
    private Integer idQuantidadeMatriculasOutros;
    private Integer estrangeiro;
    private Integer financiamento;
    private Integer deficiencia;
    private Integer alunosApoioSocial;
    private Integer fkInfoMatriculas;

    public Integer getIdQuantidadeMatriculasOutros() {
        return idQuantidadeMatriculasOutros;
    }

    public void setIdQuantidadeMatriculasOutros(Integer idQuantidadeMatriculasOutros) {
        this.idQuantidadeMatriculasOutros = idQuantidadeMatriculasOutros;
    }

    public Integer getEstrangeiro() {
        return estrangeiro;
    }

    public void setEstrangeiro(Integer estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    public Integer getFinanciamento() {
        return financiamento;
    }

    public void setFinanciamento(Integer financiamento) {
        this.financiamento = financiamento;
    }

    public Integer getDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(Integer deficiencia) {
        this.deficiencia = deficiencia;
    }

    public Integer getAlunosApoioSocial() {
        return alunosApoioSocial;
    }

    public void setAlunosApoioSocial(Integer alunosApoioSocial) {
        this.alunosApoioSocial = alunosApoioSocial;
    }

    public Integer getFkInfoMatriculas() {
        return fkInfoMatriculas;
    }

    public void setFkInfoMatriculas(Integer fkInfoMatriculas) {
        this.fkInfoMatriculas = fkInfoMatriculas;
    }
}
