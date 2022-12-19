package com.minha.aposta.manel.controllers;

import com.minha.aposta.manel.dtos.CategoriaDTO;
import com.minha.aposta.manel.model.Categoria;
import com.minha.aposta.manel.services.CategoriaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity saveCategoria(@RequestBody CategoriaDTO categoriaDTO){

        Categoria categoria = new Categoria();
        BeanUtils.copyProperties(categoriaDTO, categoria);
        categoriaService.saveCategoria(categoria);
        return ResponseEntity.status(HttpStatus.OK).body(null);

    }
}
