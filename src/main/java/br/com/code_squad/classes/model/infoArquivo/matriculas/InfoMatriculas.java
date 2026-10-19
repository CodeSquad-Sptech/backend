package br.com.code_squad.classes.model.infoArquivo.matriculas;

public class InfoMatriculas {
    private Integer idInfoMatriculas;
    private Integer fkInfoCurso;

    public InfoMatriculas(Integer idInfoMatriculas, Integer fkInfoCurso) {
        this.idInfoMatriculas = idInfoMatriculas;
        this.fkInfoCurso = fkInfoCurso;
    }

    public Integer getIdInfoMatriculas() {
        return idInfoMatriculas;
    }

    public void setIdInfoMatriculas(Integer idInfoMatriculas) {
        this.idInfoMatriculas = idInfoMatriculas;
    }

    public Integer getFkInfoCurso() {
        return fkInfoCurso;
    }

    public void setFkInfoCurso(Integer fkInfoCurso) {
        this.fkInfoCurso = fkInfoCurso;
    }
}
