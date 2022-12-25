package com.minha.aposta.manel.dtos;
import lombok.Data;

@Data
public class HistoricoFutebolDTO {

    private int escanteioCasa;

    private int escanteioVisitante;

    private int cartaoAmareloCasa;

    private int cartaoAmareloVisitante;

    private int cartaoVermelhoCasa;

    private int cartaoVermelhoVisitante;

    private int golCasa;

    private int golVisitante;

    private int totalEscanteio;

    private int totalCartao;

    private int totalGol;

    private Long  idPartida;
}
