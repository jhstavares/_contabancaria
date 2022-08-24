package com.aula2308.contabancaria.model;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "contabancaria")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String numeroDeConta;

    @Column(length = 20)
    private String agencia;

    @Column(length = 50)
    private String nomeDoUsuario;

    @Column(length = 50)
    private BigDecimal valorAtualDaConta;

    @Column(length = 50)
    private BigDecimal valorFinal;

    @Column(length = 50)
    private BigDecimal valorFornecido;

    @Column(length = 50)
    private String tipoDeServico;

}
