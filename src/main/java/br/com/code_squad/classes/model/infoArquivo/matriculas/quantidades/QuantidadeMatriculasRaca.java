package br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades;

public class QuantidadeMatriculasRaca {
    private Integer idQuantidadeMatriculasRaca;
    private Integer branca;
    private Integer preta;
    private Integer parda;
    private Integer amarela;
    private Integer indigena;
    private Integer naoDeclarada;
    private Integer fkInfoMatriculas;

    public QuantidadeMatriculasRaca(Integer idQuantidadeMatriculasRaca, Integer branca, Integer preta, Integer parda, Integer amarela, Integer indigena, Integer naoDeclarada, Integer fkInfoMatriculas) {
        this.idQuantidadeMatriculasRaca = idQuantidadeMatriculasRaca;
        this.branca = branca;
        this.preta = preta;
        this.parda = parda;
        this.amarela = amarela;
        this.indigena = indigena;
        this.naoDeclarada = naoDeclarada;
        this.fkInfoMatriculas = fkInfoMatriculas;
    }

    public Integer getIdQuantidadeMatriculasRaca() {
        return idQuantidadeMatriculasRaca;
    }

    public void setIdQuantidadeMatriculasRaca(Integer idQuantidadeMatriculasRaca) {
        this.idQuantidadeMatriculasRaca = idQuantidadeMatriculasRaca;
    }

    public Integer getBranca() {
        return branca;
    }

    public void setBranca(Integer branca) {
        this.branca = branca;
    }

    public Integer getPreta() {
        return preta;
    }

    public void setPreta(Integer preta) {
        this.preta = preta;
    }

    public Integer getParda() {
        return parda;
    }

    public void setParda(Integer parda) {
        this.parda = parda;
    }

    public Integer getAmarela() {
        return amarela;
    }

    public void setAmarela(Integer amarela) {
        this.amarela = amarela;
    }

    public Integer getIndigena() {
        return indigena;
    }

    public void setIndigena(Integer indigena) {
        this.indigena = indigena;
    }

    public Integer getNaoDeclarada() {
        return naoDeclarada;
    }

    public void setNaoDeclarada(Integer naoDeclarada) {
        this.naoDeclarada = naoDeclarada;
    }

    public Integer getFkInfoMatriculas() {
        return fkInfoMatriculas;
    }

    public void setFkInfoMatriculas(Integer fkInfoMatriculas) {
        this.fkInfoMatriculas = fkInfoMatriculas;
    }
}
