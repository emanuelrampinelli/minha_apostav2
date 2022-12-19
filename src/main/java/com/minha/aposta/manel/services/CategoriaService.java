package com.minha.aposta.manel.services;

import com.minha.aposta.manel.model.Categoria;
import com.minha.aposta.manel.repositorys.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public void saveCategoria(Categoria categoria){
        categoriaRepository.save(categoria);
    }
}
