package com.minha.aposta.manel.controllers;

import com.minha.aposta.manel.dtos.CategoriaEsporteDTO;
import com.minha.aposta.manel.model.CategoriaEsporte;
import com.minha.aposta.manel.services.CategoriaEsporteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoriaEsporte")
public class CategoriaEsporteController {

    @Autowired
    private CategoriaEsporteService categoriaEsporteService;

    @PostMapping
    public ResponseEntity saveCategoria(@RequestBody CategoriaEsporteDTO categoriaEsporteDTO){

        CategoriaEsporte categoria = new CategoriaEsporte();
        BeanUtils.copyProperties(categoriaEsporteDTO, categoria);
        categoriaEsporteService.saveCategoria(categoria);
        return ResponseEntity.status(HttpStatus.OK).body(null);

    }
}
