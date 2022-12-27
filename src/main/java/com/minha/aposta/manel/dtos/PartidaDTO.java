package com.minha.aposta.manel.dtos;
import lombok.Data;
@Data
public class PartidaDTO {

    private String dataEvento;
    private Long idEquipeCasa;
    private Long idEquipeVisitante;
    private Long idCategoriaCampeonato;
    private String descricao;
}
