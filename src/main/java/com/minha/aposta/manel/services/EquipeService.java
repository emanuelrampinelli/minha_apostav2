package com.minha.aposta.manel.services;

import com.minha.aposta.manel.dtos.EquipeDTO;
import com.minha.aposta.manel.model.Equipe;
import com.minha.aposta.manel.repositorys.CategoriaCampeonatoRepository;
import com.minha.aposta.manel.repositorys.EquipeRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipeService {

    @Autowired
    private EquipeRepository equipeRespository;


    @Autowired
    private CategoriaCampeonatoRepository categoriaCampeonatoRepository;

    public void save (EquipeDTO equipeDTO){

        Equipe equipe = new Equipe();
        BeanUtils.copyProperties(equipeDTO, equipe);
        equipeRespository.save(equipe);
    }
}
