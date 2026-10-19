package br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades;

public class QuantidadeMatriculasSexo {
    private Integer idQuantidadeMatriculasSexo;
    private Integer feminino;
    private Integer masculino;
    private Integer fkInfoMatriculas;

    public QuantidadeMatriculasSexo(Integer idQuantidadeMatriculasSexo, Integer feminino, Integer masculino, Integer fkInfoMatriculas) {
        this.idQuantidadeMatriculasSexo = idQuantidadeMatriculasSexo;
        this.feminino = feminino;
        this.masculino = masculino;
        this.fkInfoMatriculas = fkInfoMatriculas;
    }

    public Integer getIdQuantidadeMatriculasSexo() {
        return idQuantidadeMatriculasSexo;
    }

    public void setIdQuantidadeMatriculasSexo(Integer idQuantidadeMatriculasSexo) {
        this.idQuantidadeMatriculasSexo = idQuantidadeMatriculasSexo;
    }

    public Integer getFeminino() {
        return feminino;
    }

    public void setFeminino(Integer feminino) {
        this.feminino = feminino;
    }

    public Integer getMasculino() {
        return masculino;
    }

    public void setMasculino(Integer masculino) {
        this.masculino = masculino;
    }

    public Integer getFkInfoMatriculas() {
        return fkInfoMatriculas;
    }

    public void setFkInfoMatriculas(Integer fkInfoMatriculas) {
        this.fkInfoMatriculas = fkInfoMatriculas;
    }
}
