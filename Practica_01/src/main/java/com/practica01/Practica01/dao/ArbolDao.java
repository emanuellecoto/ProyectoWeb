package com.practica01.Practica01.dao;

import com.practica01.Practica01.domain.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArbolDao 
    extends JpaRepository<Arbol,Long>{
    
}
