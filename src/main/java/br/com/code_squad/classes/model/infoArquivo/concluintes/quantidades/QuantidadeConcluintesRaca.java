package br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades;

import br.com.code_squad.classes.model.infoArquivo.base.quantidades.Raca;

public class QuantidadeConcluintesRaca extends Raca {

    public QuantidadeConcluintesRaca(Integer id, Integer fk, Integer branca, Integer preta, Integer parda, Integer amarela, Integer indigena, Integer corNaoDeclarada) {
        super(id, fk, branca, preta, parda, amarela, indigena, corNaoDeclarada);
    }
}
