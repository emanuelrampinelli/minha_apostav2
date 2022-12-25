package com.minha.aposta.manel.controllers;

import com.minha.aposta.manel.dtos.HistoricoFutebolDTO;
import com.minha.aposta.manel.services.HistoricoFutebolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/historicoFutebol")
public class HistoricoFutebolController {

    @Autowired
    private HistoricoFutebolService historicoFutebolService;

    @PostMapping
    public ResponseEntity save (@RequestBody HistoricoFutebolDTO historicoFutebolDTO){

        historicoFutebolService.save(historicoFutebolDTO);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
