package com.minha.aposta.manel.services;

import com.minha.aposta.manel.model.CategoriaCampeonato;
import com.minha.aposta.manel.repositorys.CategoriaCampeonatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaCampeonatoService {

    @Autowired
    private CategoriaCampeonatoRepository categoriaCampeonatoRepository;

    public void saveCategoria(CategoriaCampeonato categoria){
        categoriaCampeonatoRepository.save(categoria);
    }
}
