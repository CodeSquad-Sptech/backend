package br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades;

public class QuantidadeMatriculasTurno {
    private Integer idQuantidadeMatriculasTurno;
    private Integer diurno;
    private Integer noturno;
    private Integer fkInfoMatriculas;

    public Integer getIdQuantidadeMatriculasTurno() {
        return idQuantidadeMatriculasTurno;
    }

    public void setIdQuantidadeMatriculasTurno(Integer idQuantidadeMatriculasTurno) {
        this.idQuantidadeMatriculasTurno = idQuantidadeMatriculasTurno;
    }

    public Integer getDiurno() {
        return diurno;
    }

    public void setDiurno(Integer diurno) {
        this.diurno = diurno;
    }

    public Integer getNoturno() {
        return noturno;
    }

    public void setNoturno(Integer noturno) {
        this.noturno = noturno;
    }

    public Integer getFkInfoMatriculas() {
        return fkInfoMatriculas;
    }

    public void setFkInfoMatriculas(Integer fkInfoMatriculas) {
        this.fkInfoMatriculas = fkInfoMatriculas;
    }
}
