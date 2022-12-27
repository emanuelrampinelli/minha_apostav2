package com.minha.aposta.manel.controllers;

import com.minha.aposta.manel.dtos.HistoricoTemporalPartidaDTO;
import com.minha.aposta.manel.services.HistoricoTemporalPartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/historicoFutebol")
public class HistoricoTemporalPartidaController {

    @Autowired
    private HistoricoTemporalPartidaService historicoTemporalPartidaService;

    @PostMapping
    public ResponseEntity save (@RequestBody HistoricoTemporalPartidaDTO historicoTemporalPartidaDTO){

        historicoTemporalPartidaService.save(historicoTemporalPartidaDTO);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    @GetMapping
    public ResponseEntity findAll (@RequestBody HistoricoTemporalPartidaDTO historicoTemporalPartidaDTO){
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
