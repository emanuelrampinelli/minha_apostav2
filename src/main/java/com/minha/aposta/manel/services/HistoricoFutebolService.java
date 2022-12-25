package com.minha.aposta.manel.services;

import com.minha.aposta.manel.dtos.HistoricoFutebolDTO;
import com.minha.aposta.manel.dtos.PartidaDTO;
import com.minha.aposta.manel.model.HistoricoFutebol;
import com.minha.aposta.manel.repositorys.HistoricoFutebolRepository;
import com.minha.aposta.manel.repositorys.PartidaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoricoFutebolService {

    @Autowired
    private HistoricoFutebolRepository historicoFutebolRepository;

    @Autowired
    private PartidaRepository partidaRepository;

    public void save (HistoricoFutebolDTO historicoFutebolDTO){

        HistoricoFutebol historicoFutebol = new HistoricoFutebol();
        BeanUtils.copyProperties(historicoFutebolDTO, historicoFutebol);

        historicoFutebol.setPartida(partidaRepository.getById(historicoFutebolDTO.getIdPartida()));

        historicoFutebol.setTotalCartao(totalCartao(historicoFutebolDTO));
        historicoFutebol.setTotalGol(totalGol(historicoFutebolDTO));
        historicoFutebol.setTotalEscanteio(totalEscanteio(historicoFutebolDTO));

        historicoFutebolRepository.save(historicoFutebol);
    }

    private int totalCartao(HistoricoFutebolDTO historicoFutebolDTO){
        return  historicoFutebolDTO.getCartaoAmareloCasa() +
                historicoFutebolDTO.getCartaoAmareloVisitante() +
                historicoFutebolDTO.getCartaoVermelhoCasa() +
                historicoFutebolDTO.getCartaoVermelhoVisitante();
    }
    private int totalEscanteio (HistoricoFutebolDTO historicoFutebolDTO){
        return historicoFutebolDTO.getEscanteioCasa() +
                historicoFutebolDTO.getEscanteioVisitante();
    }

    private int totalGol (HistoricoFutebolDTO historicoFutebolDTO){
        return historicoFutebolDTO.getGolCasa() +
                historicoFutebolDTO.getGolVisitante();
    }
}
