package com.minha.aposta.manel.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "HISTORICO_TEMPORAL_GOL")
@Data
public class HistoricoTemporalGol {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private int tempoMomento;

    @Column
    private String nomeJogador;

    @Column
    private String descricao;

    @ManyToOne
    private Equipe equipe;

}
