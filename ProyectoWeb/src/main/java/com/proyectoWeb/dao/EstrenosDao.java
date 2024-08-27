
package com.proyectoWeb.dao;

import com.proyectoWeb.domain.Estrenos;
import com.proyectoWeb.domain.Snacks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstrenosDao 
extends JpaRepository<Estrenos,Long>{
    
}
