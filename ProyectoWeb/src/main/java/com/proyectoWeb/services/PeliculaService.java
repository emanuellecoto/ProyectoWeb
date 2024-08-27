package com.proyectoWeb.services;

import com.proyectoWeb.domain.Peliculas;
import java.util.List;

public interface PeliculaService {

    public List<Peliculas> getPeliculas(boolean stock);

    public Peliculas getPelicula(Peliculas peliculas);

    public void save(Peliculas peliculas);

    public void delete(Peliculas peliculas);
}
