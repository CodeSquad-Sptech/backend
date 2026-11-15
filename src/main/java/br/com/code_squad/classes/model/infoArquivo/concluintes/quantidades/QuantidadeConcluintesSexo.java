package br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades;

import br.com.code_squad.classes.model.infoArquivo.base.quantidades.Sexo;

public class QuantidadeConcluintesSexo extends Sexo {

    public QuantidadeConcluintesSexo(Integer idQuantidadeConcluintesSexo, Integer feminino, Integer masculino, Integer fkInfoConcluintes) {
        super(idQuantidadeConcluintesSexo, feminino, masculino, fkInfoConcluintes);
    }
}
