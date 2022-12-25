package com.minha.aposta.manel.dtos;
import lombok.Data;
@Data
public class PartidaDTO {

    private String dataEvento;
    private Long idEquipeA;
    private Long idEquipeB;
    private Long idCategoriaEsporte;
    private Long idCategoriaCampeonato;
    private String descricao;
}
