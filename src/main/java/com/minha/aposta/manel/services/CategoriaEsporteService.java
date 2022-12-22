package com.minha.aposta.manel.services;

import com.minha.aposta.manel.model.CategoriaEsporte;
import com.minha.aposta.manel.repositorys.CategoriaEsporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaEsporteService {

    @Autowired
    private CategoriaEsporteRepository categoriaEquipeRepository;

    public void saveCategoria(CategoriaEsporte categoria){
        categoriaEquipeRepository.save(categoria);
    }
}
