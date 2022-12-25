package com.minha.aposta.manel.controllers;

import com.minha.aposta.manel.dtos.PartidaDTO;
import com.minha.aposta.manel.services.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/partida")
public class PartidaController {

    @Autowired
    private PartidaService partidaService;

    @PostMapping
    public ResponseEntity save (@RequestBody PartidaDTO partidaDTO){
        partidaService.save(partidaDTO);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
