package br.com.company.rh.service;

import br.com.company.rh.ValidacaoException;
import br.com.company.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {

	public void validar(Funcionario funcionario, BigDecimal aumento){

		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);

		if (mesesDesdeUltimoReajuste< 6) {
			throw new ValidacaoException("Intervalo entre reajustes deve ser maior que 6 meses!");
		}

	}

}
