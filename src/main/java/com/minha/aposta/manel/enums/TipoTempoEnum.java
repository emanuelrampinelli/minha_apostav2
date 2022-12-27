package com.minha.aposta.manel.enums;

public enum TipoTempoEnum {

    PRIMEIRO_TEMPO("Primeiro Tempo"),
    SEGUNDO_TEMPO("Segundo Tempo"),
    PRIMERO_TEMPO_PRORROGACAO("Primeiro Tempo Prorrogação"),
    SEGUNDO_TEMPO_PRORROGACAO("Segundo Tempo Prorrogação");

    private String tempo;

    TipoTempoEnum(String tempo) {
        this.tempo = tempo;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
}
