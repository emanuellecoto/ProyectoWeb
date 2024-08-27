
package com.proyectoWeb.dao;

import com.proyectoWeb.domain.Snacks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SnacksDao 
extends JpaRepository<Snacks,Long>{
    
}
