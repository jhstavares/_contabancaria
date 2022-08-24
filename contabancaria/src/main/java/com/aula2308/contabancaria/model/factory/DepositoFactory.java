package com.aula2308.contabancaria.model.factory;

import com.aula2308.contabancaria.model.ContaModel;

import java.math.BigDecimal;

public class DepositoFactory implements Factory {

    @Override
    public BigDecimal calculo(ContaModel contaModel) {
        return contaModel.getValorAtualDaConta().add(contaModel.getValorFornecido());
    }
}
