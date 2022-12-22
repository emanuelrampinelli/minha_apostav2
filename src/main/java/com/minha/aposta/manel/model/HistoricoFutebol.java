package com.minha.aposta.manel.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "HISTORICO_FUTEBOL")
@Data
public class HistoricoFutebol {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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

    @Column
    private int golCasa;

    @Column
    private int golVisitante;

    @Column
    private int totalEscanteio;

    @Column
    private int totalCartao;

    @Column
    private int totalGol;

    @OneToOne
    private Partida partida;

}
