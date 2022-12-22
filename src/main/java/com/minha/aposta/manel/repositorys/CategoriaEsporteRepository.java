package com.minha.aposta.manel.repositorys;

import com.minha.aposta.manel.model.CategoriaEsporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaEsporteRepository extends JpaRepository<CategoriaEsporte,Long> {

}
