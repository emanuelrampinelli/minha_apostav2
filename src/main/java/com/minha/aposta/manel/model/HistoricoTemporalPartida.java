package com.minha.aposta.manel.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "HISTORICO_TEMPORAL_PARTIDA")
@Data
public class HistoricoTemporalPartida {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String tipoTempo;

    @Column
    private int golCasa;

    @Column
    private int golVisitante;

    @Column
    private int escanteioCasa;

    @Column
    private int escanteioVisitante;

    @Column
    private int cartaoAmareloCasa;

    @Column
    private int cartaoAmareloVisitante;

    @Column
    private int cartaoVermelhoCasa;

    @Column
    private int cartaoVermelhoVisitante;

    @ManyToOne
    private HistoricoTemporalGol historicoTemporalGol;

    @ManyToOne
    private Partida partida;

}
