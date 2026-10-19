package br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades;

public class QuantidadeConcluintesIdade {
    private Integer idQuantidadeConcluintesIdade;
    private Integer concluintes0a17;
    private Integer concluintes18a24;
    private Integer concluintes25a29;
    private Integer concluintes30a34;
    private Integer concluintes35a39;
    private Integer concluintes40a49;
    private Integer concluintes50a59;
    private Integer concluintes60Mais;
    private Integer fkInfoConcluintes;

    public QuantidadeConcluintesIdade(Integer idQuantidadeConcluintesIdade, Integer concluintes0a17, Integer concluintes18a24, Integer concluintes25a29, Integer concluintes30a34, Integer concluintes35a39, Integer concluintes40a49, Integer concluintes50a59, Integer concluintes60Mais, Integer fkInfoConcluintes) {
        this.idQuantidadeConcluintesIdade = idQuantidadeConcluintesIdade;
        this.concluintes0a17 = concluintes0a17;
        this.concluintes18a24 = concluintes18a24;
        this.concluintes25a29 = concluintes25a29;
        this.concluintes30a34 = concluintes30a34;
        this.concluintes35a39 = concluintes35a39;
        this.concluintes40a49 = concluintes40a49;
        this.concluintes50a59 = concluintes50a59;
        this.concluintes60Mais = concluintes60Mais;
        this.fkInfoConcluintes = fkInfoConcluintes;
    }

    public Integer getIdQuantidadeConcluintesIdade() {
        return idQuantidadeConcluintesIdade;
    }

    public void setIdQuantidadeConcluintesIdade(Integer idQuantidadeConcluintesIdade) {
        this.idQuantidadeConcluintesIdade = idQuantidadeConcluintesIdade;
    }

    public Integer getConcluintes0a17() {
        return concluintes0a17;
    }

    public void setConcluintes0a17(Integer concluintes0a17) {
        this.concluintes0a17 = concluintes0a17;
    }

    public Integer getConcluintes18a24() {
        return concluintes18a24;
    }

    public void setConcluintes18a24(Integer concluintes18a24) {
        this.concluintes18a24 = concluintes18a24;
    }

    public Integer getConcluintes25a29() {
        return concluintes25a29;
    }

    public void setConcluintes25a29(Integer concluintes25a29) {
        this.concluintes25a29 = concluintes25a29;
    }

    public Integer getConcluintes30a34() {
        return concluintes30a34;
    }

    public void setConcluintes30a34(Integer concluintes30a34) {
        this.concluintes30a34 = concluintes30a34;
    }

    public Integer getConcluintes35a39() {
        return concluintes35a39;
    }

    public void setConcluintes35a39(Integer concluintes35a39) {
        this.concluintes35a39 = concluintes35a39;
    }

    public Integer getConcluintes40a49() {
        return concluintes40a49;
    }

    public void setConcluintes40a49(Integer concluintes40a49) {
        this.concluintes40a49 = concluintes40a49;
    }

    public Integer getConcluintes50a59() {
        return concluintes50a59;
    }

    public void setConcluintes50a59(Integer concluintes50a59) {
        this.concluintes50a59 = concluintes50a59;
    }

    public Integer getConcluintes60Mais() {
        return concluintes60Mais;
    }

    public void setConcluintes60Mais(Integer concluintes60Mais) {
        this.concluintes60Mais = concluintes60Mais;
    }

    public Integer getFkInfoConcluintes() {
        return fkInfoConcluintes;
    }

    public void setFkInfoConcluintes(Integer fkInfoConcluintes) {
        this.fkInfoConcluintes = fkInfoConcluintes;
    }
}
