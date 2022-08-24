package com.aula2308.contabancaria.model.factory;

import com.aula2308.contabancaria.model.ContaModel;

import java.math.BigDecimal;

public interface Factory {
    public BigDecimal calculo(ContaModel contaModel);

}
