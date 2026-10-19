package br.com.code_squad.classes.model.infoArquivo.concluintes;

public class InfoConcluintes {
    private Integer idInfoConcluintes;
    private Integer fkInfoCurso;

    public InfoConcluintes(Integer idInfoConcluintes, Integer fkInfoCurso) {
        this.idInfoConcluintes = idInfoConcluintes;
        this.fkInfoCurso = fkInfoCurso;
    }

    public Integer getIdInfoConcluintes() {
        return idInfoConcluintes;
    }

    public void setIdInfoConcluintes(Integer idInfoConcluintes) {
        this.idInfoConcluintes = idInfoConcluintes;
    }

    public Integer getFkInfoCurso() {
        return fkInfoCurso;
    }

    public void setFkInfoCurso(Integer fkInfoCurso) {
        this.fkInfoCurso = fkInfoCurso;
    }
}
