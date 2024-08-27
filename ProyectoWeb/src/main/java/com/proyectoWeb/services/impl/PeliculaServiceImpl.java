package com.proyectoWeb.services.impl;

import com.proyectoWeb.dao.PeliculasDao;
import com.proyectoWeb.domain.Peliculas;
import com.proyectoWeb.services.PeliculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PeliculaServiceImpl 
     implements PeliculaService {

    @Autowired
    private PeliculasDao peliculasDao;

    @Override
    @Transactional(readOnly = true)
    public List<Peliculas> getPeliculas(boolean stock) {
        var lista = peliculasDao.findAll();
        return lista;
    }

    @Override
    public Peliculas getPelicula(Peliculas peliculas) {
        return peliculasDao.findById(peliculas.getIdPelicula()).orElse(null);
    }

    @Override
    public void save(Peliculas peliculas) {
        peliculasDao.save(peliculas);
    }

    @Override
    public void delete(Peliculas peliculas) {
        peliculasDao.delete(peliculas);
    }



}
