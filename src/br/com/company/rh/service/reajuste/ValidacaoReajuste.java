package br.com.company.rh.service.reajuste;

import br.com.company.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

    void validar(Funcionario funcionario, BigDecimal aumento);

}
