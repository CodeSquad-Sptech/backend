package br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades;

import br.com.code_squad.classes.model.infoArquivo.base.quantidades.Outros;

public class QuantidadeMatriculasOutros extends Outros {
    private Integer alunosApoioSocial;
    private Integer quantidadeAlunosSituacaoTrancada;

    public QuantidadeMatriculasOutros(Integer id, Integer fk, Integer estrangeiro, Integer financiamento, Integer deficiencia, Integer alunosApoioSocial, Integer quantidadeAlunosSituacaoTrancada) {
        super(id, fk, estrangeiro, financiamento, deficiencia);
        this.alunosApoioSocial = alunosApoioSocial;
        this.quantidadeAlunosSituacaoTrancada = quantidadeAlunosSituacaoTrancada;
    }

    public Integer getAlunosApoioSocial() {
        return alunosApoioSocial;
    }

    public void setAlunosApoioSocial(Integer alunosApoioSocial) {
        this.alunosApoioSocial = alunosApoioSocial;
    }

    public Integer getQuantidadeAlunosSituacaoTrancada() {
        return quantidadeAlunosSituacaoTrancada;
    }

    public void setQuantidadeAlunosSituacaoTrancada(Integer quantidadeAlunosSituacaoTrancada) {
        this.quantidadeAlunosSituacaoTrancada = quantidadeAlunosSituacaoTrancada;
    }
}
