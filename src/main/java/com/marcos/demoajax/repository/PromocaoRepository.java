package com.marcos.demoajax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.demoajax.domain.Promocao;

@Repository
public interface PromocaoRepository extends JpaRepository<Promocao, Long>{

}
