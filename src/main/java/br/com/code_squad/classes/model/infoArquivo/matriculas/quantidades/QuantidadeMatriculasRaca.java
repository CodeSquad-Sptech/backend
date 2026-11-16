package br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades;

import br.com.code_squad.classes.model.infoArquivo.base.quantidades.Raca;

public class QuantidadeMatriculasRaca extends Raca {

    public QuantidadeMatriculasRaca(Integer id, Integer fk, Integer branca, Integer preta, Integer parda, Integer amarela, Integer indigena, Integer corNaoDeclarada) {
        super(id, fk, branca, preta, parda, amarela, indigena, corNaoDeclarada);
    }
}
