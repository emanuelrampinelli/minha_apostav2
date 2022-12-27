package com.minha.aposta.manel.controllers;

import com.minha.aposta.manel.dtos.CategoriaCampeonatoDTO;
import com.minha.aposta.manel.model.CategoriaCampeonato;
import com.minha.aposta.manel.services.CategoriaCampeonatoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoriaCampeonato")
public class CategoriaCampeonatoController {

    @Autowired
    private CategoriaCampeonatoService categoriaService;

    @PostMapping
    public ResponseEntity saveCategoria(@RequestBody CategoriaCampeonatoDTO categoriaCampeonatoDTO){

        CategoriaCampeonato categoria = new CategoriaCampeonato();
        BeanUtils.copyProperties(categoriaCampeonatoDTO, categoria);
        categoriaService.saveCategoria(categoria);
        return ResponseEntity.status(HttpStatus.OK).body(null);

    }
}
