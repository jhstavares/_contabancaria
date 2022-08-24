package com.aula2308.contabancaria.repository;


import com.aula2308.contabancaria.model.ContaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<ContaModel, Long >  {

}
