package com.minha.aposta.manel.services;

import com.minha.aposta.manel.dtos.HistoricoTemporalPartidaDTO;
import com.minha.aposta.manel.repositorys.HistoricoTemporalPartidaRepository;
import com.minha.aposta.manel.repositorys.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoricoTemporalPartidaService {

    @Autowired
    private HistoricoTemporalPartidaRepository historicoFutebolRepository;

    @Autowired
    private PartidaRepository partidaRepository;

    public void save (HistoricoTemporalPartidaDTO historicoTemporalPartidaDTO){

//        HistoricoTemporalPartida historicoTemporalPartida = new HistoricoTemporalPartida();
//        BeanUtils.copyProperties(historicoFutebolDTO, historicoTemporalPartida);
//
//        historicoTemporalPartida.setPartida(partidaRepository.getById(historicoFutebolDTO.getIdPartida()));
//
//        historicoTemporalPartida.setTotalCartao(totalCartao(historicoFutebolDTO));
//        historicoTemporalPartida.setTotalGol(totalGol(historicoFutebolDTO));
//        historicoTemporalPartida.setTotalEscanteio(totalEscanteio(historicoFutebolDTO));
//
//        historicoFutebolRepository.save(historicoTemporalPartida);
    }

    private int totalCartao(HistoricoTemporalPartidaDTO historicoTemporalPartidaDTO){
        return  historicoTemporalPartidaDTO.getCartaoAmareloCasa() +
                historicoTemporalPartidaDTO.getCartaoAmareloVisitante() +
                historicoTemporalPartidaDTO.getCartaoVermelhoCasa() +
                historicoTemporalPartidaDTO.getCartaoVermelhoVisitante();
    }
    private int totalEscanteio (HistoricoTemporalPartidaDTO historicoTemporalPartidaDTO){
        return historicoTemporalPartidaDTO.getEscanteioCasa() +
                historicoTemporalPartidaDTO.getEscanteioVisitante();
    }

    private int totalGol (HistoricoTemporalPartidaDTO historicoTemporalPartidaDTO){
        return historicoTemporalPartidaDTO.getGolCasa() +
                historicoTemporalPartidaDTO.getGolVisitante();
    }
}
