package com.minha.aposta.manel.controllers;

import com.minha.aposta.manel.dtos.EquipeDTO;
import com.minha.aposta.manel.services.EquipeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipe")
public class EquipeController {

//    @Autowired
//    private EquipeService equipeService;

    @PostMapping
    public ResponseEntity saveEquipe(@RequestBody EquipeDTO equipeDTO){

//        equipeService.save(equipeDTO);
       return ResponseEntity.status(HttpStatus.OK).body(null);

    }
}
