package com.aula2308.contabancaria.model.factory;

public class CalculosFactory {
    public static Factory calcular(String tipoDeServico){
        if (tipoDeServico.equalsIgnoreCase("Deposito")){
            return new DepositoFactory();
        } else if (tipoDeServico.equalsIgnoreCase("Saque")) {
            return new SaqueFactory();

        }else {
            return null;
        }
    }
}
