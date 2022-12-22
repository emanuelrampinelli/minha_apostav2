package com.minha.aposta.manel.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PARTIDA")
@Data
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Date dataEvento;

    @ManyToOne
    private Equipe equipeA;

    @ManyToOne
    private Equipe equipeB;

    @ManyToOne
    private CategoriaEsporte categoriaEsporte;

}
