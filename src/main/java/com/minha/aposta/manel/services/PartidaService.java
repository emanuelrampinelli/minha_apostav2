package com.minha.aposta.manel.services;

import com.minha.aposta.manel.dtos.PartidaDTO;
import com.minha.aposta.manel.model.CategoriaCampeonato;
import com.minha.aposta.manel.model.CategoriaEsporte;
import com.minha.aposta.manel.model.Equipe;
import com.minha.aposta.manel.model.Partida;
import com.minha.aposta.manel.repositorys.CategoriaCampeonatoRepository;
import com.minha.aposta.manel.repositorys.CategoriaEsporteRepository;
import com.minha.aposta.manel.repositorys.EquipeRepository;
import com.minha.aposta.manel.repositorys.PartidaRepository;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PartidaService {

    @Autowired
    private PartidaRepository partidaRepository;

    @Autowired
    private CategoriaEsporteRepository categoriaEsporteRepository;

    @Autowired
    private CategoriaCampeonatoRepository categoriaCampeonatoRepository;

    @Autowired
    private EquipeRepository equipeRepository;


    public void save(PartidaDTO partidaDTO){
        Partida partida = new Partida();

        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("dd-MM-yyyy");
        DateTime dateTime = dateTimeFormatter.parseDateTime(partidaDTO.getDataEvento());

        Optional<CategoriaEsporte> categoriaEsporte =
                categoriaEsporteRepository.findById(partidaDTO.getIdCategoriaEsporte());

        Optional<CategoriaCampeonato> categoriaCampeonato =
                categoriaCampeonatoRepository.findById(partidaDTO.getIdCategoriaCampeonato());

        Optional<Equipe> equipeA = equipeRepository.findById(partidaDTO.getIdEquipeA());
        Optional<Equipe> equipeB = equipeRepository.findById(partidaDTO.getIdEquipeB());


        partida.setCategoriaEsporte(categoriaEsporte.get());
        partida.setCategoriaCampeonato(categoriaCampeonato.get());
        partida.setEquipeA(equipeA.get());
        partida.setEquipeB(equipeB.get());
        partida.setDataEvento(dateTime.toDate());
        partida.setDescricao(partidaDTO.getDescricao());

        partidaRepository.save(partida);
    }
}
