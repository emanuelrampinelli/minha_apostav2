package com.minha.aposta.manel.dtos;
import lombok.Data;

@Data
public class HistoricoTemporalPartidaDTO {

    private String tipoTempo;

    private int golCasa;

    private int golVisitante;

    private int escanteioCasa;

    private int escanteioVisitante;

    private int cartaoAmareloCasa;

    private int cartaoAmareloVisitante;

    private int cartaoVermelhoCasa;

    private int cartaoVermelhoVisitante;

    private Long  idPartida;
}
