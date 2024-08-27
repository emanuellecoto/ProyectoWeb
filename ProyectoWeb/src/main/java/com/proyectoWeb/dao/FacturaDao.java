package com.proyectoWeb.dao;

import com.proyectoWeb.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FacturaDao
       extends JpaRepository<Factura,Long>{
    
}
