
package com.proyectoWeb.dao;

import com.proyectoWeb.domain.Peliculas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculasDao 
extends JpaRepository<Peliculas,Long>{
    
}
