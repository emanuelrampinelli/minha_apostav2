package com.minha.aposta.manel.services;

import com.minha.aposta.manel.dtos.EquipeDTO;
import com.minha.aposta.manel.model.CategoriaCampeonato;
import com.minha.aposta.manel.model.CategoriaEsporte;
import com.minha.aposta.manel.model.Equipe;
import com.minha.aposta.manel.repositorys.CategoriaCampeonatoRepository;
import com.minha.aposta.manel.repositorys.CategoriaEsporteRepository;
import com.minha.aposta.manel.repositorys.EquipeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EquipeService {

    @Autowired
    private EquipeRepository equipeRespository;

    @Autowired
    private CategoriaEsporteRepository categoriaEsporteRepository;

    @Autowired
    private CategoriaCampeonatoRepository categoriaCampeonatoRepository;

    public void save (EquipeDTO equipeDTO){

        Equipe equipe = new Equipe();
        BeanUtils.copyProperties(equipeDTO, equipe);

        Optional<CategoriaEsporte> categoriaEsporte =
                categoriaEsporteRepository.findById(equipeDTO.getIdCategoriaEsporte());

        Optional<CategoriaCampeonato> categoriaCampeonato =
                categoriaCampeonatoRepository.findById(equipeDTO.getIdCategoriaCampeonato());


        equipe.setCategoriaEsporte(categoriaEsporte.get());
        equipe.setCategoriaCampeonato(categoriaCampeonato.get());

        equipeRespository.save(equipe);
    }
}
