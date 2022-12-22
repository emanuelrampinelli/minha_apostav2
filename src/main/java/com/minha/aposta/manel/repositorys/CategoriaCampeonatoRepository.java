package com.minha.aposta.manel.repositorys;

import com.minha.aposta.manel.model.CategoriaCampeonato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaCampeonatoRepository extends JpaRepository<CategoriaCampeonato,Long> {

}
