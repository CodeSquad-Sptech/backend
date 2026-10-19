package br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades;

public class QuantidadeConcluintesSexo {
    private Integer idQuantidadeConcluintesSexo;
    private Integer feminino;
    private Integer masculino;
    private Integer fkInfoConcluintes;

    public QuantidadeConcluintesSexo(Integer idQuantidadeConcluintesSexo, Integer feminino, Integer masculino, Integer fkInfoConcluintes) {
        this.idQuantidadeConcluintesSexo = idQuantidadeConcluintesSexo;
        this.feminino = feminino;
        this.masculino = masculino;
        this.fkInfoConcluintes = fkInfoConcluintes;
    }

    public Integer getIdQuantidadeConcluintesSexo() {
        return idQuantidadeConcluintesSexo;
    }

    public void setIdQuantidadeConcluintesSexo(Integer idQuantidadeConcluintesSexo) {
        this.idQuantidadeConcluintesSexo = idQuantidadeConcluintesSexo;
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

    public Integer getFkInfoConcluintes() {
        return fkInfoConcluintes;
    }

    public void setFkInfoConcluintes(Integer fkInfoConcluintes) {
        this.fkInfoConcluintes = fkInfoConcluintes;
    }
}
