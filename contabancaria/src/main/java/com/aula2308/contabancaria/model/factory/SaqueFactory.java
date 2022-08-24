package com.aula2308.contabancaria.model.factory;

import com.aula2308.contabancaria.model.ContaModel;

import java.math.BigDecimal;

public class SaqueFactory implements Factory {
    @Override
    public BigDecimal calculo(ContaModel contaModel) {
        return contaModel.getValorAtualDaConta().subtract(contaModel.getValorFornecido());
    }


}
