package com.aula2308.contabancaria.controller;


import com.aula2308.contabancaria.model.ContaModel;
import com.aula2308.contabancaria.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContaController {

    @Autowired
    private ContaService service;

    @GetMapping(path = "/contaBancaria")
    public List<ContaModel> buscarConta() {
        return service.buscarTodasAsContas();

    }

    @GetMapping(path = "/contaBancaria/{codigoDaConta}")
    public Optional<ContaModel> bucarContaPorId(Long codigoDaConta) {
        return service.buscarPorId(codigoDaConta);
    }

    @PostMapping(path = "/contaBancaria")
    public ContaModel cadastrarConta(@RequestBody ContaModel conta) {
       return service.cadastrarConta(conta) ;


    }
    @DeleteMapping(path = "/contaBancaria/{codigoDaConta}")
    public void deletarConta(@PathVariable Long Id){
        service.deletar(Id);
    }
}


