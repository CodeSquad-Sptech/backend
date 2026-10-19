package br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades;

public class QuantidadeConcluintesTurno {
    private Integer idQuantidadeConcluintesTurno;
    private Integer diurno;
    private Integer noturno;
    private Integer fkInfoConcluintes;

    public QuantidadeConcluintesTurno(Integer idQuantidadeConcluintesTurno, Integer diurno, Integer noturno, Integer fkInfoConcluintes) {
        this.idQuantidadeConcluintesTurno = idQuantidadeConcluintesTurno;
        this.diurno = diurno;
        this.noturno = noturno;
        this.fkInfoConcluintes = fkInfoConcluintes;
    }

    public Integer getIdQuantidadeConcluintesTurno() {
        return idQuantidadeConcluintesTurno;
    }

    public void setIdQuantidadeConcluintesTurno(Integer idQuantidadeConcluintesTurno) {
        this.idQuantidadeConcluintesTurno = idQuantidadeConcluintesTurno;
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

    public Integer getFkInfoConcluintes() {
        return fkInfoConcluintes;
    }

    public void setFkInfoConcluintes(Integer fkInfoConcluintes) {
        this.fkInfoConcluintes = fkInfoConcluintes;
    }
}
