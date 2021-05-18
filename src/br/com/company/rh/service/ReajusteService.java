package br.com.company.rh.service;

import br.com.company.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

	List<ValidacaoReajuste> validacoes;

	public ReajusteService(List<ValidacaoReajuste> validacoes){
		this.validacoes = validacoes;
	}

	public void validar(Funcionario funcionario, BigDecimal aumento){

		validacoes.forEach(validacaoReajuste -> validacaoReajuste.validar(funcionario, aumento));

		BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);

	}

}
