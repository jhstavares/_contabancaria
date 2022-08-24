package com.aula2308.contabancaria.service;


import com.aula2308.contabancaria.model.ContaModel;
import com.aula2308.contabancaria.model.factory.CalculosFactory;
import com.aula2308.contabancaria.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ContaService {
    @Autowired
    private ContaRepository repository;

    public List<ContaModel> buscarTodasAsContas() {
        return repository.findAll();

    }

    public Optional<ContaModel> buscarPorId(Long condigoDaConta) {
        return repository.findById(condigoDaConta);
    }

    public ContaModel cadastrarConta(ContaModel contaModel) {
        BigDecimal resultado = CalculosFactory.calcular(contaModel.getTipoDeServico()).calculo(contaModel);
        contaModel.setValorFinal(resultado);

        return repository.save(contaModel);

    }

    public void deletar(Long Id) {
        repository.deleteById(Id);

    }
}
